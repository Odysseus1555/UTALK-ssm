package com.xmpp207.util;

import java.util.Date;

/** 
* @ClassName: AbstractJSON 
* @Description: Json数据响应基类
* @author bjh
* @date 2019年5月15日 上午10:42:23 
*  
*/
public class AbstractJSON {
	
	private String code;                      //响应状态码
	private String msg;						  //响应状态描述
	private long time = new Date().getTime(); //时间戳
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public void setContent(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public void setStatusObject(StatusObject statusobject) {
		this.code = statusobject.getCode();
		this.msg = statusobject.getMsg();
		
	}
	

}
