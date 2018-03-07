package com.pattern.factory.factory;

public class FactoryTest {

	public static void main(String[] args) {

		System.out.println("简单工厂模式");
		
		Factory factory = new Factory();
		
		System.out.println(factory.getMilk("伊利").getName());
		System.out.println(factory.getMilk("蒙牛").getName());
		System.out.println(factory.getMilk("三元"));
	}

}
