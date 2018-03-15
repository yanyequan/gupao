package com.pattern.adapter;

public class UserService {

	public void Regis(String uid, String pwd){
		
		System.out.println("老系统注册，用户"+ uid +"，密码"+ pwd);
	}
	
	public void Login(String uid, String pwd) {

		System.out.println("老系统登录，用户"+ uid +"，密码"+ pwd);
	}
}
