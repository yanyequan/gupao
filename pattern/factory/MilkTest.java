package com.pattern.factory;

public class MilkTest {

	public static void main(String[] args) {

		System.out.println("手工模式");
		
		Milk milk;
		
		milk = new Yili();
		System.out.println(milk.getName());
		
		milk = new Mengniu();
		System.out.println(milk.getName());
		
		milk = new Sanyuan();
		System.out.println(milk.getName());
	}

}
