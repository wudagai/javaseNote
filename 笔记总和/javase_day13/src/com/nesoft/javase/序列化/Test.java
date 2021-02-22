package com.nesoft.javase.序列化;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test {

	public static void main(String[] args) {
		ObjectInputStream in=null;
		try {
			in=new ObjectInputStream(new FileInputStream(new File("D:/student.txt")));
			Student ss=(Student) in.readObject();
			System.out.println(ss);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
