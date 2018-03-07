package com.pattern.factory.abstractfactory;

import com.pattern.factory.Mengniu;
import com.pattern.factory.Milk;
import com.pattern.factory.Sanyuan;
import com.pattern.factory.Yili;

public class MilkFactory extends AbstractFactory{

	@Override
	public Milk getYili() {

		return new Yili();
	}

	@Override
	public Milk getMengniu() {

		return new Mengniu();
	}

	@Override
	public Milk getSanyuan() {

		return new Sanyuan();
	}

}
