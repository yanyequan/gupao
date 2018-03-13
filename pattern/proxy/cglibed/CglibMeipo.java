package com.pattern.proxy.cglibed;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibMeipo implements MethodInterceptor{

	//可以接受任何类 Class
	public Object getInstance(Class<?> clazz) throws Exception{
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

		methodProxy.invokeSuper(o, objects);//可以代理对象的所有的事情,不是 invoke
		System.out.println("我去给你办事...");
		System.out.println("办好了，感觉怎么样");
		
		return null;
	}

	
}
