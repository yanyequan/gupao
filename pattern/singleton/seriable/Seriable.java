package com.pattern.singleton.seriable;

import java.io.Serializable;

public class Seriable implements Serializable {

	private static final long serialVersionUID = 4981233444339093382L;
	private static final Seriable INSTANCE = new Seriable();
	
	public static Seriable getInstance(){
		
		return INSTANCE; 
	}
	
	private Object readResolve(){
		
		return INSTANCE;
	}
}
