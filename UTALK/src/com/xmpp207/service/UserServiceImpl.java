package com.xmpp207.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmpp207.mapper.UserMapper;
import com.xmpp207.pojo.User;
import com.xmpp207.xmpp.XmppUtil;
@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper usermapper;

	@Override
	public User logincheck(User user) {
		User u = usermapper.logincheck(user);
		return u;
	}

	@Override
	public void register(User user) {
		XmppUtil xu = new XmppUtil();
		xu.createuser(user);
		usermapper.register(user);
		
	}

}
