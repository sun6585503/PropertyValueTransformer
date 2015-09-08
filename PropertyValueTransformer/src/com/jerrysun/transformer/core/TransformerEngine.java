package com.jerrysun.transformer.core;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jerrysun.transformer.profile.bean.Mapping;
import com.jerrysun.transformer.profile.bean.Mapping.MappingElement;
import com.jerrysun.transformer.profile.bean.Mapping.MappingElement.PropertyMapping;
import com.jerrysun.transformer.profile.bean.Mapping.MappingElement.PropertyMapping.ValueMapping;
import com.jerrysun.transformer.profile.bean.MappingResultObject;

public class TransformerEngine {

	String profilePath;
	
	Mapping.MappingElement currentMappingElemet;
	
	Mapping mappingInstance;
	
	public TransformerEngine(String profilePath) {
		super();
		this.profilePath = profilePath;
		init(profilePath);
	}



	private void init(String profilePath)
	{
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(Mapping.class);
			Unmarshaller u = jc.createUnmarshaller();
			String xmlFilePath = TransformerEngine.class.getResource(profilePath).getPath();
			//System.out.println(xmlFilePath);
			mappingInstance = (Mapping) u.unmarshal(new File(xmlFilePath));
			//System.out.println(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loadMappingElement(String mappingElementName)
	{
		
		List<com.jerrysun.transformer.profile.bean.Mapping.MappingElement> elements = mappingInstance.getMappingElement();
	
		for(MappingElement element:elements)
		{
			if(element.getName().equalsIgnoreCase(mappingElementName))
				{
				currentMappingElemet= element;
				return;
				}
		}
		currentMappingElemet=null;
	}
	
	public MappingResultObject getMappingResult(String sourceKey,String sourceValue)
	{
		MappingResultObject result=new MappingResultObject();
		
		List<PropertyMapping> propertyMappings = currentMappingElemet.getPropertyMapping();
		
		for(PropertyMapping propertyMappingElement:propertyMappings)
		{
			if(propertyMappingElement.getSourceKey().equalsIgnoreCase(sourceKey))
				{
				String targetKey = propertyMappingElement.getTargetKey();
				
				List<ValueMapping> valueMappings = propertyMappingElement.getValueMapping();
				
				for(ValueMapping valueMappingElement:valueMappings)
				{
					
					String sourceMappingValue=valueMappingElement.getSourceValue();
					
					if(sourceMappingValue.equalsIgnoreCase(sourceValue))
					{
						String targetValue = valueMappingElement.getTargetValue();
						result.setSourceKey(sourceKey);
						result.setSourceValue(sourceValue);
						result.setKey(targetKey);
						result.setValue(targetValue);
						return result;
					}
				}
				}
		}
		
		return null;
	}
	
}
