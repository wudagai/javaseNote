package com.nesoft.javase.IO流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1、使用字节流将123abc写到D：/b.txt
 * @author Administrator
 * 
 *2、使用字符流将123abc中写到D：/b.txt
 */
public class TestWriter {
	public static void testByteWriter() {
//		创建文件对象
		File dest=new File("D:/b.txt");
		FileOutputStream out=null;
		try {
//			搭建输出管道
			out=new FileOutputStream(dest);
//			使用输出管道将内存中的内容输出到文件中
//			write(int) 一个一个字节写,如果没有文件存在，这个方法会帮你在磁盘中创建文件
			out.write(49);// 1  49  
			out.write(50);// 
			out.write(51);
			out.write(97);
			out.write(98);
			out.write(99);// c  99
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			关闭流
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}
//	使用字符流将123abc中写到D：/b.txt
	public static void testCharWriter() {
		File dest=new File("D:/b.txt");
		FileWriter out=null;
		try {
//			搭建字符输出管道
			out=new FileWriter(dest);
			out.write(49);//一个一个字符的写
			out.write(50);
			out.write(51);
			out.write(97);
			out.write(98);
			out.write(99);
			out.write(20013);//中
			out.write(22269);//国
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			关闭流
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
//		testByteWriter();
		testCharWriter();

	}

}
