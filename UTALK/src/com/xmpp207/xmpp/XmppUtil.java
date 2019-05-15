package com.xmpp207.xmpp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.iqregister.AccountManager;

import com.xmpp207.pojo.User;


/** 
* @ClassName: XmppUtil 
* @Description: 使用smack类库操作openfire服务的方法类
* @author bjh
* @date 2019年5月13日 上午9:32:02 
*  
*/
public class XmppUtil {
	
	String username=null;
	String password=null;
	String personalname=null;
	String group=null;
	
	
	
	/** 
	* @Title: createuser 
	* @Description: 注册用户
	* @param @param user  参数说明 
	* @return void    返回类型 
	* @throws 
	*/
	public void createuser(User user) {
		// TODO Auto-generated method stub
		username = user.getName();
		password = user.getPwd();
		personalname = user.getPersonalname();
		group = user.getGroup();
		
		//为group创建群组
		creategroup(user);
		
		//其他属性值存入attrbutes
		Map<String, String> attributes = new HashMap<>();
		attributes.put("personalname", personalname);
		attributes.put("group", group);
		
		AbstractXMPPConnection conn = getXmppConnection.getConnection();
		try {
			conn.connect();
			AccountManager accountmanager = AccountManager.getInstance(conn);
			accountmanager.createAccount(username, password,attributes);
			
		} catch (SmackException | IOException | XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
	
	/** 
	* @Title: creategroup 
	* @Description: 创建群组
	* @param @param user  参数说明 
	* @return void    返回类型 
	* @throws 
	*/
	public void creategroup(User user) {
		
		
		
		
	}

}
