package com.pattern.observer.simpled;

public class SimpledObserverTest {

	public static void main(String[] args) {

		System.out.println("简单的观察者模式测试");
		
		//被观察者
		Subjects subject = new Subjects();
		
		//加入观察者
		IObserver observer1 = new Observers("zhangsan");
		IObserver observer2 = new Observers("lisi");
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		
		//发布消息
		subject.publishMsg("今天有大雪");
		
	}

}
