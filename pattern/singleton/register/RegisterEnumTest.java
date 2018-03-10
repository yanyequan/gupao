package com.pattern.singleton.register;

import java.util.concurrent.CountDownLatch;

public class RegisterEnumTest {

	public static void main(String[] args) {


		System.out.println("枚举单例模式测试：多线程安全");
		
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
					Object register = RegisterEnum.INSTANCE.getInstance();
					System.out.println(System.currentTimeMillis()+":"+ register);
				}
			}.start();
			
			latch.countDown();
		}		
	}

}
