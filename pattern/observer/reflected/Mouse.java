package com.pattern.observer.reflected;

//（被观察者）：继承事件监听类，增加触发方法并触发对应的事件
public class Mouse extends EventListener{

	public void click(){
		
		System.out.println("鼠标单击");
		this.trigger(MouseEventType.ON_CLICK);
	}
	
	public void down(){
		
		System.out.println("鼠标按下");
		this.trigger(MouseEventType.ON_DOWN);
	}
	
	public void up(){
		
		System.out.println("鼠标弹起");
		this.trigger(MouseEventType.ON_UP);
	}
}
