package com.xmpp207.util;

import java.util.List;

/** 
* @ClassName: ListObject 
* @Description: 建立JSON数组到ListObject
* @author bjh
* @date 2019年5月15日 下午2:30:24 
*  
*/
public class ListObject extends AbstractJSON{
	
	private List<?> items;			  //列表对象
	
	public List<?> getItems() {
		return items;
	}

	public void setItems(List<?> items) {
		this.items = items;
	}
}
