package com.pattern.factory.factorymethord;

public class FactoryMethordTest {

	public static void main(String[] args) {
		
		System.out.println("工厂方法模式");
		
		FactoryMethod factory;
		
		factory = new YiliFactory();
		System.out.println(factory.getMilk().getName());
		
		factory = new MengniuFactory();
		System.out.println(factory.getMilk().getName());
		
		factory = new SanyuanFactory();
		System.out.println(factory.getMilk().getName());
	}
}
