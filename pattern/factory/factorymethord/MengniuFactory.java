package com.pattern.factory.factorymethord;

import com.pattern.factory.Mengniu;
import com.pattern.factory.Milk;

public class MengniuFactory implements FactoryMethod{

	@Override
	public Milk getMilk(){
		return new Mengniu();
	}
}
