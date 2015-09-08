package com.jerrysun.transformer.demo;

import com.jerrysun.transformer.core.TransformerEngine;
import com.jerrysun.transformer.demo.object.MACMsgHandler;
import com.jerrysun.transformer.demo.object.MsgBean;
import com.jerrysun.transformer.demo.object.WindowsMsgHandler;

public class ObjectValueTransformDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isMAC=true;
		
		boolean isWIN=true;
		
		String filePath="/com/jerrysun/transformer/demo/demoMapping.xml";
		
		TransformerEngine engine=new TransformerEngine(filePath);
		
		MsgBean testMsg=new MsgBean();
		
		testMsg.setCommandType(1);
		
		System.out.println("系统执行“关机”命令");
		
		if(isMAC)
		{
			MACMsgHandler macHandler=new MACMsgHandler();
			
			engine.loadMappingElement("ObjectValueTransformValueMapping4MAC");
		
			macHandler.doCommand(Integer.parseInt(engine.getMappingResult("command", ""+testMsg.getCommandType()).getValue()));
		}
		
		if(isWIN)
		{
			WindowsMsgHandler winHandler=new WindowsMsgHandler();
			
			engine.loadMappingElement("ObjectValueTransformValueMapping4WIN");
		
			winHandler.doCommand(Integer.parseInt(engine.getMappingResult("command", ""+testMsg.getCommandType()).getValue()));
		}
	}
	
}
