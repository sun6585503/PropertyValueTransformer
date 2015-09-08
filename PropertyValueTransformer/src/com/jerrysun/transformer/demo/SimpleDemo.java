package com.jerrysun.transformer.demo;

import com.jerrysun.transformer.core.TransformerEngine;

public class SimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath="/com/jerrysun/transformer/demo/demoMapping.xml";
		
		TransformerEngine engine=new TransformerEngine(filePath);
		
		engine.loadMappingElement("DeviceLoopbackValueMapping");
		
		System.out.println(engine.getMappingResult("enableValue", "1"));
		System.out.println(engine.getMappingResult("enableValue", "2"));
		System.out.println(engine.getMappingResult("enableValue", "3"));
	}

}
