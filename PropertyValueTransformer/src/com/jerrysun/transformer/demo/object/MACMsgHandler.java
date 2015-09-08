package com.jerrysun.transformer.demo.object;

public class MACMsgHandler {

	
	/**
	 * command：
	 * 命令类型
	 * 1：重新启动
	 * 2:关机
	 * 3:注销
	 */
	
	public void doCommand(int command)
	{
		//执行Mac系统操作
		if(command==1)
		    System.out.println("MAC系统执行“重新启动”命令");
		if(command==2)
			System.out.println("MAC系统执行“关机”命令");
		if(command==3)
			System.out.println("MAC系统执行“注销”命令");
		
	}
	
	
	
}
