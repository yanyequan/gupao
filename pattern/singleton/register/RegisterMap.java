package com.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

public class RegisterMap {

	private static Map<String, Object> register = new HashMap<String, Object>();
	
	public static RegisterMap getInstance(String name){
		
		if(name == null){
			
			name = RegisterMap.class.getName();
		}
		
		synchronized(RegisterMap.class){
			if(register.get(name) == null){
			
				//睡一会容易测试出来是否有多线程问题
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				register.put(name, new RegisterMap());
			}
		}
		
		return (RegisterMap) register.get(name);
	}
}
