package com.pattern.proxy.staticed;

public class Son implements Person{

	@Override
	public void findLove() {

		System.out.println("我要找个对象，要求肤白貌美大长腿");
	}

	@Override
	public void findJob() {

		System.out.println("我要找个工作，要求吃喝玩乐不上班");
	}

}
