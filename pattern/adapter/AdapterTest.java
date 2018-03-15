package com.pattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {

		System.out.println("适配器模式测试");
		
		UserServiceAdapter adapter = new UserServiceAdapter();
		
		adapter.Regis("zhansan", "123");
		adapter.Login("zhansan", "123");
	}

}
