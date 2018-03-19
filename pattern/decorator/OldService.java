package com.pattern.decorator;

public class OldService implements IOldService{

	@Override
	public void reg(String uid, String pwd) {
		
		System.out.println("老系统注册方法，用户"+ uid);
	}

	@Override
	public void login(String uid, String pwd) {
		
		System.out.println("老系统登录方法，用户"+ uid);
	}

}
