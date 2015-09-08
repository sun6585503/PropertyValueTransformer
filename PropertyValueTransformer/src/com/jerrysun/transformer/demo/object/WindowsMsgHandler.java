package com.jerrysun.transformer.demo.object;

public class WindowsMsgHandler {
	
	/**
	 * command：
	 * 命令类型
	 * 1：注销
	 * 2:重新启动
	 * 3:关机
	 */
	
	public void doCommand(int command)
	{
		//执行Windows系统操作
		if(command==1)
		    System.out.println("Windows系统执行“注销”命令");
		if(command==2)
			System.out.println("Windows系统执行“重新启动”命令");
		if(command==3)
			System.out.println("Windows系统执行“关机”命令");
		
	}
	

}
