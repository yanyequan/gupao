package com.pattern.proxy.cglibed;

public class CglibProxyTest {

	public static void main(String[] args) {

		try {
			/**
			 * 不需要事先代理这件事情也能做，
			 * 可以代理任何对象，如王五和赵六，
			 * 也可以代理对象的任何方法，如找对象和找工作
			 */
			Wangwu wangwu = (Wangwu) new CglibMeipo().getInstance(Wangwu.class);
			wangwu.findLove(); //可以给 王五 找对象
			wangwu.findJob(); //可以找 王五 工作
			System.out.println(wangwu.getClass());
			
			Zhaoliu zhaoliu = (Zhaoliu) new CglibMeipo().getInstance(Zhaoliu.class);
			zhaoliu.findLove(); //也可以给 赵六 找对象
			zhaoliu.findJob(); //也可以给 赵六 找工作
			System.out.println(zhaoliu.getClass());
			
			System.out.println("===下面的打印会调用两次代理的 intercept 方法呢？");
			System.out.println(zhaoliu);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
