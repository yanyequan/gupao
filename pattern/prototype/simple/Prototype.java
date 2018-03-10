package com.pattern.prototype.simple;

public abstract class Prototype implements Cloneable{

	public String name;
	public Prototype prototype;
	
	@Override
	protected Prototype clone() {
		
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return prototype;
	}

}
