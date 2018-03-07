package com.pattern.factory.factory;

import com.pattern.factory.Mengniu;
import com.pattern.factory.Milk;
import com.pattern.factory.Sanyuan;
import com.pattern.factory.Yili;

public class Factory {
	
	public Milk getMilk(String name){
		if ("伊利".equals(name)){
			return new Yili();
		}else if ("蒙牛".equals(name)){
			return new Mengniu();
		}else if ("三元".equals(name)){
			return new Sanyuan();
		}else{
			System.out.println("没有你需要的这个产品："+ name);
			return null;
		}
	}
}
