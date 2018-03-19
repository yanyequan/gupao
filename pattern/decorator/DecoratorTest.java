package com.pattern.decorator;

public class DecoratorTest {

	public static void main(String[] args) {

		System.out.println("装饰着模式测试");
		
		//原系统不受影响，仍然可以使用
		OldService old = new OldService();
		
		old.reg("lisi", "456");
		old.login("lisi", "456");
		
		//新系统增加新功能也可以使用
		NewService service = new NewService(new OldService());
		
		service.loginQQ("1234567890");
		service.loginWX("0123456789");
	}

}
