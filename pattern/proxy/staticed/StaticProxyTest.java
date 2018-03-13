package com.pattern.proxy.staticed;

public class StaticProxyTest {

	public static void main(String[] args) {

		Father father = new Father(new Son());
		
		father.findLove(); //需要事先代理这件事情
		
		//father.findJob(); //没有代理这件事情
	}

}
