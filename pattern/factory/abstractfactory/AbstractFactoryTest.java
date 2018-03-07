package com.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		System.out.println("抽象工厂模式");
		
		MilkFactory factory = new MilkFactory();
		
		System.out.println(factory.getYili().getName());
		System.out.println(factory.getMengniu().getName());
		System.out.println(factory.getSanyuan().getName());
	}

}
