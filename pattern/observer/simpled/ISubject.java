package com.pattern.observer.simpled;

//发布者接口
public interface ISubject {

	public void addObserver(IObserver ob);
	
	public void deleteObserver(IObserver ob);

}
