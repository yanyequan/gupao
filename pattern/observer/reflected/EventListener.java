package com.pattern.observer.reflected;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

//事件监听器（被观察者）：增加监听对象（观察者）、监听事件、回调方法，触发回调方法
public class EventListener {

	private Map<Enum<?>, Event> events = new HashMap<Enum<?>, Event>();
	
	public void addListener(Enum<?> eventType, Object target, Method callback){
		
		events.put(eventType, new Event(target, callback));
	}
	
	protected void trigger(Enum<?> eventType){
		
		if(events.containsKey(eventType)){
			
			Event e = events.get(eventType);
			e.setTrigger(eventType.toString());
			trigger(e);
		}
	}
	
	private void trigger(Event event){
		
		event.setSource(this);
		try {
			event.getCallback().invoke(event.getTarget(), event);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
