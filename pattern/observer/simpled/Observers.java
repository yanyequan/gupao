package com.pattern.observer.simpled;

//观察者接口实现
public class Observers implements IObserver{

	private String name;
	
	public Observers(String name) {

		this.name = name;
	}

	@Override
	public void monitor(String msg) {

		System.out.println(name +" 监听到消息："+ msg);
	}

}
