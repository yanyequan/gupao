package com.pattern.observer.simpled;

import java.util.ArrayList;
import java.util.List;

//发布者接口实现
public class Subjects implements ISubject{

	private List<IObserver> list;
	private String msg;
	
	public Subjects() {
		list = new ArrayList<IObserver>();
	}

	@Override
	public void addObserver(IObserver ob) {
		list.add(ob);
	}

	@Override
	public void deleteObserver(IObserver ob) {
		if(list.indexOf(ob) > 0){
			list.remove(ob);
		}
	}

	private void notifyObserver() {
		for(IObserver o: list){
			o.monitor(msg);
		}
	}
	
	public void publishMsg(String msg){
		this.msg = msg;
		System.out.println("开始发布消息："+ msg);
		this.notifyObserver();
	}

}
