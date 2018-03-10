package com.pattern.singleton.lazy;

import java.util.concurrent.CountDownLatch;

public class LazyOneTest {

	public static void main(String[] args) {

		System.out.println("懒汉一单例模式测试：多线程不安全");
		
		int count = 100;
		CountDownLatch latch = new CountDownLatch(count);
		
		for(int i = 0; i < count; i++){
			
			new Thread(){
				@Override
				public void run() {

					try {
						latch.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					LazyOne lazy = LazyOne.getInstance();
					System.out.println(System.currentTimeMillis()+":"+ lazy);
				}
			}.start();
			
			latch.countDown();
		}
	}

}
