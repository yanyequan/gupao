package com.pattern.observer.reflected;

//（观察者）：观察触发的事件
public class MouseEventCallback {

	public void onClick(Event e){
		
		System.out.println("触发鼠标单击事件："+ e);
	}
	
	public void onDown(Event e){
		
		System.out.println("触发鼠标按下事件："+ e);
	}
	
	public void onUp(Event e){
		
		System.out.println("触发鼠标弹起事件："+ e);
	}
}
