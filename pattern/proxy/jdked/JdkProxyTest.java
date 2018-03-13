package com.pattern.proxy.jdked;

import com.pattern.proxy.staticed.Person;

public class JdkProxyTest {

	public static void main(String[] args) {

		try {
			/**
			 * 不需要事先代理这件事情也能做，
			 * 可以代理任何对象，如张三和李四，
			 * 但只能代理接口  person 有的方法，如找对象和找工作
			 */
			Zhangsan zhangsan = new Zhangsan();
			Person personzhangsan = (Person) new JdkMeipo().getInstance(zhangsan);
			personzhangsan.findLove(); //可以找对象
			personzhangsan.findJob(); //可以找工作
			System.out.println(zhangsan.getClass());
			System.out.println(personzhangsan.getClass());
			
			Lisi lisi = new Lisi();
			Person personlisi = (Person) new JdkMeipo().getInstance(lisi);
			personlisi.findLove(); //可以找对象
			personlisi.findJob(); //可以找工作
			System.out.println(lisi.getClass());
			System.out.println(personlisi.getClass());
			
			System.out.println("===下面的打印会调用一次代理的 invoke 方法呢？");
			System.out.println(lisi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
