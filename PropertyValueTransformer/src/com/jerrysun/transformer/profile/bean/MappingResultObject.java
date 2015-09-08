package com.jerrysun.transformer.profile.bean;

public class MappingResultObject {

String sourceKey;

String sourceValue;
	
String key;

String value;

public MappingResultObject() {
	super();
	// TODO Auto-generated constructor stub
}

public String getKey() {
	return key;
}

public void setKey(String key) {
	this.key = key;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public String getSourceKey() {
	return sourceKey;
}

public void setSourceKey(String sourceKey) {
	this.sourceKey = sourceKey;
}

public String getSourceValue() {
	return sourceValue;
}

public void setSourceValue(String sourceValue) {
	this.sourceValue = sourceValue;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "SourceKey=\""+this.getSourceKey()+"\" SourceValue=\""+this.getSourceValue()
			+"\" TargetKey=\""+this.getKey()+"\" TargetValue=\""+this.getValue()+"\"";
}



}
