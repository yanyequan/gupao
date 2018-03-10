package com.pattern.singleton.seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableTest {

	public static void main(String[] args) {

		Seriable s1 = Seriable.getInstance();
		Seriable s2 = null;
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("seriable.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("seriable.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s2 = (Seriable) ois.readObject();
			ois.close();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1 == s2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
