package com.pattern.observer.reflected;

import java.lang.reflect.Method;

//事件类：记录事件的源对象（被观察者）、目标对象（观察者）、目标对象回调方法、触发事件名称
public class Event {

	private Object source;
	
	private Object target;
	
	private Method callback;
	
	private String trigger;

	public Event(Object target, Method callback) {
		this.target = target;
		this.callback = callback;
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Method getCallback() {
		return callback;
	}

	public void setCallback(Method callback) {
		this.callback = callback;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	@Override
	public String toString() {
		return "\nEvent [\nsource=" + source + ", \ntarget=" + target + ", \ncallback=" + callback + ", \ntrigger=" + trigger
				+ "]";
	}

}
