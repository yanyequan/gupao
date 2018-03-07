package com.pattern.factory.factorymethord;

import com.pattern.factory.Milk;
import com.pattern.factory.Yili;

public class YiliFactory implements FactoryMethod{

	@Override
	public Milk getMilk(){
		return new Yili();
	}
}
