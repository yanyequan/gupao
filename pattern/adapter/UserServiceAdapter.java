package com.pattern.adapter;

public class UserServiceAdapter extends UserService{

	//新系统服务方法，通过继承调用老系统服务方法，不影响老系统，这是类适配器
	//也可以通过持有老系统类引用调用老系统服务方法，这是对象适配器
	public void Regis(String uid, String pwd) {
		
		System.out.println("新系统注册调用老系统注册");
		super.Regis(uid, pwd);
	}

	public void Login(String uid, String pwd) {
		
		System.out.println("新系统登录调用老系统登录");
		super.Login(uid, pwd);
	}
 
}
