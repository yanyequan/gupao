package com.pattern.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ConcretePrototype extends Prototype implements Serializable{

	private static final long serialVersionUID = -3864660316605130039L;
	public String name;
	public ConcretePrototype prototype;
	
	@Override
	protected Prototype clone() {
		
		return super.clone();
	}
	
	public Prototype copy(){
		
		ConcretePrototype concreteprototype = new ConcretePrototype();
		concreteprototype.name = this.name;
		
		concreteprototype.prototype = new ConcretePrototype();
		concreteprototype.prototype.name = this.prototype.name;
		
		return concreteprototype;
	}
	
	public Prototype deepClone(){
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois;
			ois = new ObjectInputStream(bis);
			ConcretePrototype prototype = (ConcretePrototype)ois.readObject();
			
			return prototype;
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
