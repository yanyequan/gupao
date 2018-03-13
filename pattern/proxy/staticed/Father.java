package com.pattern.proxy.staticed;

public class Father {

	private Person person;
	
	public Father(Person person){
		
		this.person = person;
	}
	
	public void findLove(){
		
		person.findLove();
		System.out.println("我去给你找对象...");
		System.out.println("给你找到对象了，你看看怎么样");
	}
	
}
