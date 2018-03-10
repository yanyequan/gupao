package com.pattern.singleton.hungry;

import java.util.concurrent.CountDownLatch;

public class HungryTest {

	public static void main(String[] args) {

		System.out.println("恶汉单例模式测试：多线程安全");
		
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
					Hungry hungry = Hungry.getInstance();
					System.out.println(System.currentTimeMillis()+":"+ hungry);
				}
			}.start();
			
			latch.countDown();
		}
	}

}
