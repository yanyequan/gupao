package com.pattern.observer.reflected;

import java.lang.reflect.Method;

public class ReflectedObserverTest {

	public static void main(String[] args) {

		System.out.println("反射的观察者模式测试");
		
		//观察者和事件监听方法
		MouseEventCallback callback = new MouseEventCallback();
		Method onclick = null;
		try {
			onclick = MouseEventCallback.class.getMethod("onClick", Event.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//被观察者和注册观察者
		Mouse mouse = new Mouse();
		mouse.addListener(MouseEventType.ON_CLICK, callback, onclick);
		
		//被观察者事件触发，观察者会监听到
		mouse.click();
		
	}

}
