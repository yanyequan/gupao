package com.pattern.singleton.lazy;

public class LazyTwo {
	
	/**
	 * 懒汉二单例模式：
	 * 延时加载，需要时实例化，节省内存，加锁保证多线程安全，但是导致效率下降
	 */
	
	private LazyTwo(){}
	
	private static LazyTwo lazy = null;
	
	public static synchronized LazyTwo getInstance(){
		
		if (lazy == null){
			
			//睡一会容易测试出来是否有多线程问题
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lazy = new LazyTwo();
		}
		
		return lazy;
	}

}
