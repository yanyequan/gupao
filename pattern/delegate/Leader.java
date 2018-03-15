package com.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IWorker{

	//委派者要持有被委派者的引用
	private Map<String, IWorker> workers = new HashMap<String, IWorker>();
	public Leader(){
		
		workers.put("工作A", new WorkerA());
		workers.put("工作B", new WorkerB());
	}
	
	//负责人自己不干活，只负责根据工人情况分派工作
	@Override
	public void doing(String work) {

		workers.get(work).doing(work);
	}

}
