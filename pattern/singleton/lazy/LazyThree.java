package com.pattern.singleton.lazy;

public class LazyThree {

	/**
	 * 懒汉三单例模式：
	 * 通过静态内部类，需要时加载，节省内存，只有一个实例，保证了多线程安全
	 */
	
	private LazyThree(){}
	
	public static LazyThree getInstance(){
		
		return LazyHolder.LAZY;
	}

	private static class LazyHolder {
		
		private static final LazyThree LAZY = new LazyThree();
	}
	
}
