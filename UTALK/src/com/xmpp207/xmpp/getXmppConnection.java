package com.xmpp207.xmpp;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder;

public class getXmppConnection {
	
	
	public static AbstractXMPPConnection  getConnection(){
		AbstractXMPPConnection connection = null;
		Builder builder = XMPPTCPConnectionConfiguration.builder();
		builder.setSecurityMode(SecurityMode.disabled);
		XMPPTCPConnectionConfiguration config = builder
				.setServiceName("47.101.186.124")
				.setHost("47.101.186.124")
				.setPort(5222)
				.setSendPresence(true)
				.build();
		
		
		
		connection = new XMPPTCPConnection(config);
		return connection;
		
	}
	
	public static AbstractXMPPConnection getConnection(boolean presence){
		
		
		AbstractXMPPConnection connection = null;
		Builder builder = XMPPTCPConnectionConfiguration.builder();
		builder.setSecurityMode(SecurityMode.disabled);
		XMPPTCPConnectionConfiguration config = builder
				.setServiceName("47.101.186.124")
				.setHost("47.101.186.124")
				.setPort(5222)
				.setSendPresence(presence)
				.build();
		
		
		
		connection = new XMPPTCPConnection(config);
		return connection;
		
	}
	
	public static void closeConnection(AbstractXMPPConnection connection){
		if (connection != null) {
			try {
				connection.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
