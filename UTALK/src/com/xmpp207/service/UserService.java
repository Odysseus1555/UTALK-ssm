package com.xmpp207.service;

import com.xmpp207.pojo.User;

public interface UserService {
	public User logincheck(User user);
	
    public void register(User user);
}
