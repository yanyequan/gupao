package com.pattern.factory.factorymethord;

import com.pattern.factory.Milk;
import com.pattern.factory.Sanyuan;

public class SanyuanFactory implements FactoryMethod{

	@Override
	public Milk getMilk(){
		return new Sanyuan();
	}
}
