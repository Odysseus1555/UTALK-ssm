package com.xmpp207.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HttpServletBean;

/**
 * 
* @ClassName: ResponseUtils 
* @Description: 关于Json的响应处理
* @author bjh
* @date 2019年5月15日 下午2:52:08 
*  
 */
public class ResponseUtils {
	/*
	 * 返回json串
	 */
	public static void renderJson(HttpServletResponse response,String text) {
		render(response,"text/plain;charset=UTF-8",text);
	}
	/*
	 * 返回文本
	 */
	public static void renderText(HttpServletResponse response,String text) {
		render(response,"text/plain;charset=UTF-8",text);
	}
	
	
	/** 
	* @Title: render 
	* @Description: 发送内容使用UTF-8编辑
	* @param response
	* @param contentType
	* @param text  参数说明 
	* @return void    返回类型 
	* @throws 
	*/
	private static void render(HttpServletResponse response, String contentType, String text) {
		response.setContentType(contentType);
		response.setCharacterEncoding("utf-8");
		response.setHeader("Pragma", "NO-cache");
		response.setHeader("Cache-Contral", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
		}
	}
	/**
	 * 界面异常回调返回JSON
	 */
	public static void outputJson(HttpServletResponse response,Object object) {
		String s = JsonWriter.toJson(object,false);
		response.setCharacterEncoding("utf-8");
		response.setHeader("Pragma", "NO-cache");
		response.setHeader("Cache-Contral", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

