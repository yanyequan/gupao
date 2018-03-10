package com.pattern.prototype.simple;

public class ConcretePrototype extends Prototype{

	public String name;
	public ConcretePrototype prototype;
	
	@Override
	protected Prototype clone() {
		
		return super.clone();
	}

}
