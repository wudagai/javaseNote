package com.nesoft.javase.序列化;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
//		序列化：通过ObjectOutputStream将对象转为字节序列的过程
		Student stu=new Student();
		stu.name="zhangsan";
		stu.password="123456";
		Student.address="东软";
		
		System.out.println(stu);//Student [name=zhangsan, age=0, address=东软, password=123456]

//		将stu对象序列化后存储在D:/student.txt
		ObjectOutputStream out=null;
		try {
			out=new ObjectOutputStream(new FileOutputStream(new File("D:/student.txt")));
			out.writeObject(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
//		反序列化：将序列化后的对象字节序列转为原本对象的过程-ObjectInputStream
//		ObjectInputStream in=null;
//		try {
//			in=new ObjectInputStream(new FileInputStream(new File("D:/student.txt")));
//			Student ss=(Student) in.readObject();
//			System.out.println(ss);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
