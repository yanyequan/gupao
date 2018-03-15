package com.pattern.delegate;

public class WorkerA implements IWorker{

	@Override
	public void doing(String work) {

		System.out.println("我是工人A，我现在开始做"+ work);
	}

}
