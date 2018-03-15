package com.pattern.delegate;

public class Boss {

	public Boss(){
		
		//委派模式角色：客户请求（Boss）、委派者（Leader）、被被委派者（Worker）
        //委派的核心：分发、调度、派遣，就是静态代理和策略模式的一种特殊组合

		Leader leader = new Leader();
		
		leader.doing("工作A");
		leader.doing("工作B");
	}
	
}
