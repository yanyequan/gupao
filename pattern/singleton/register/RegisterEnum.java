package com.pattern.singleton.register;

public enum RegisterEnum {
	
	INSTANCE;
	private Object instance;
	
	private RegisterEnum(){
		instance = new Object();
	}
	
	public Object getInstance(){
		
		return instance;
	}
}
