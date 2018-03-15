package com.pattern.delegate;

public class WorkerB implements IWorker{

	@Override
	public void doing(String work) {

		System.out.println("我是工人B，我现在开始做"+ work);
	}

}
