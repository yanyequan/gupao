package com.pattern.singleton.register;

import java.util.concurrent.CountDownLatch;

public class RegisterMapTest {

	public static void main(String[] args) {
		
		System.out.println("注册单例模式测试：实现多线程安全");
		
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
					RegisterMap register = RegisterMap.getInstance("test");
					System.out.println(System.currentTimeMillis()+":"+ register);
				}
			}.start();
			
			latch.countDown();
		}
	}

}
