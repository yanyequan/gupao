package com.pattern.singleton.hungry;

public class Hungry {

	/**
	 * 恶汉单例模式：
	 * 类加载时就实例化，只有一个实例，保证了多线程安全，但是用不用都实例化占用内存
	 */
	
	private Hungry(){}
	
	private static final Hungry hungry = new Hungry();
	
	public static Hungry getInstance(){

		return hungry;
	}

}
