package com.xmpp207.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/** 
* @ClassName: JsonUtils 
* @Description: JsonUtils 生成json数据和解析json 数据
* @author bjh
* @date 2019年5月15日 下午2:32:08 
*  
*/
public class JsonUtils {
	static ObjectMapper objectMapper;
	
	/**
	 * 
	* @Title: fromJson 
	* @Description: 解析Json
	* @param @param content
	* @param @param valueType
	* @param @return  参数说明 
	* @return T    返回类型 
	* @throws 
	 */
	
	public static <T> T fromJson(String content,Class<T> valueType) {
		if(objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		try {
			return objectMapper.readValue(content, valueType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	* @Title: toJson 
	* @Description: 根据对象生成Json
	* @param @param object
	* @param @return  参数说明 
	* @return String    返回类型 
	* @throws 
	 */
	public static String toJson(Object object) {
		if(objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
