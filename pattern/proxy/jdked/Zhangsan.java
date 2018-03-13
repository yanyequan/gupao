package com.pattern.proxy.jdked;

import com.pattern.proxy.staticed.Person;

public class Zhangsan implements Person{ //需要实现一个接口

	@Override
	public void findLove() {

		System.out.println("我是张三，我要找个对象，随便一个人就行");
	}

	@Override
	public void findJob() {

		System.out.println("我是张三，我要找个工作，只要不干活就行");
	}

	
}
