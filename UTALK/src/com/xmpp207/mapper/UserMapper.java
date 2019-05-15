package com.xmpp207.mapper;

import com.xmpp207.pojo.User;

public interface UserMapper {
	//µÇÂ¼ÑéÖ¤
	User logincheck(User user);
	//×¢²á
    void register(User user);
}
