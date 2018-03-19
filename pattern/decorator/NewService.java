package com.pattern.decorator;

public class NewService implements INewService{

	private IOldService service;
	
	public NewService(IOldService login) {
		this.service = login;
	}

	@Override
	public void reg(String uid, String pwd) {
		service.reg(uid, pwd);
	}

	@Override
	public void login(String uid, String pwd) {
		service.login(uid, pwd);
	}

	@Override
	public void loginQQ(String openId) {

		service.reg(openId, null);
		System.out.println("新系统QQ登录方法，QQ标识"+ openId);
	}

	@Override
	public void loginWX(String openId) {

		service.reg(openId, null);
		System.out.println("新系统微信登录方法，微信标识"+ openId);
	}

}
