package com.pattern.singleton.lazy;

public class LazyOne {

	/**
	 * 懒汉一单例模式：
	 * 延时加载，需要时实例化，节省内存，没有加锁多线程不安全
	 */
	
	private LazyOne(){}
	
	private static LazyOne lazy = null;
	
	public static LazyOne getInstance(){
		
		if (lazy == null){
			
			//睡一会容易测试出来是否有多线程问题
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lazy = new LazyOne();
		}
		
		return lazy;
	}

}
