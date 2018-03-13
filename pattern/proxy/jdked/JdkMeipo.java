package com.pattern.proxy.jdked;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.pattern.proxy.staticed.Person;

public class JdkMeipo implements InvocationHandler{

	private Person person;
	
	//只能接受固定的接口 Person
	public Object getInstance(Person person) throws Exception{
		
		this.person = person;
		
		Class<?> clazz = person.getClass();
		
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		method.invoke(person, args);//可以代理接口的所有的方法
		System.out.println("我去给你办事...");
		System.out.println("办好了，满意吧，给个好评吧");
		
		return null;
	}
}
