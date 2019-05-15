package com.xmpp207.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xmpp207.pojo.User;
import com.xmpp207.service.UserService;

@Controller
public class UserController {
	@Autowired
     private UserService userService;
	//ת���¼ҳ��
	@RequestMapping("tologin")
	public String tologin(){
		return "login";	
	}
	//��¼��֤
	@RequestMapping("login")
	public String  login(@RequestParam("username") String username,
			@RequestParam("password") String password,Model model){
		User user = new User();
		user.setName(username);
		user.setPwd(password);
		if(userService.logincheck(user) != null){
			model.addAttribute("username",username);
			return "index";
		}
	    else{
	    	model.addAttribute("error","�˺Ż��������");
	    	return "login";
	    }
		}
	//ת��ע��ҳ��
	@RequestMapping("toregister")
	public String toregister(){
		return "register";	
	}
	//ע��
	@RequestMapping("register")
	public String  register(@RequestParam("username") String username,
			@RequestParam("password") String password){
		User user = new User();
		user.setName(username);
		user.setPwd(password);
		userService.register(user);		
		return "login";
     }
}
