package com.jerrysun.transformer.demo.object;

public class MsgBean {

	/**
	 * 消息类型
	 * 
	 * 1:同步消息
	 * 2:异步消息
	 */
	private int msgType;
	
	/**
	 * 命令类型
	 * 
	 * 1：关机
	 * 2:重新启动
	 * 3:注销
	 */
	private int commandType;
	
	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public int getCommandType() {
		return commandType;
	}

	public void setCommandType(int commandType) {
		this.commandType = commandType;
	}

	
	
}
