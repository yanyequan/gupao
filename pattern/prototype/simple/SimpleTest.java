package com.pattern.prototype.simple;

public class SimpleTest {

	public static void main(String[] args) {

		System.out.println("简单原型模式测试");
		
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.name = "prototype";
		prototype.prototype = new ConcretePrototype();
		
		ConcretePrototype prototype1 = (ConcretePrototype) prototype.clone();
		
		System.out.println(prototype);
		System.out.println(prototype1);
		System.out.println(prototype.name);
		System.out.println(prototype1.name);//和 prototype 的值相同
		System.out.println(prototype.prototype);
		System.out.println(prototype1.prototype);//和 prototype 的值相同
		
		System.out.println("改变原对象的值，clone 对象的值不跟着改变");
		prototype.name = "prototype 0";
		prototype.prototype = new ConcretePrototype();
		
		System.out.println(prototype.name);
		System.out.println(prototype1.name);//不跟着改变
		System.out.println(prototype.prototype);
		System.out.println(prototype1.prototype);//不跟着改变
	}

}
