package com.xmpp207.mapper;

import com.xmpp207.pojo.User;

public interface UserMapper {
	//��¼��֤
	User logincheck(User user);
	//ע��
    void register(User user);
}
