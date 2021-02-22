package com.nesoft.javase.File类;

import java.io.File;
import java.util.Arrays;

/**
 * File类常用的方法
 * @author Administrator
 *
 */
public class FileMethod {

	public static void main(String[] args) {
//		boolean  createNewFile()  创建空白文件
//		boolean exists( )测试此抽象路径名表示的文件或目录是否存在
//		boolean delete( )删除此抽象路径名表示的文件或目录
		/**
		 * 注意：删除目录时只能删除空白目录
		 */
		File dest=new File("D:/a.txt");
		System.out.println(dest.delete());
		dest=new File("pic");
		dest.delete();
		File f1=new File("D:/a/b/c");
		System.out.println(f1.delete());
		f1=new File("D:/a");
		System.out.println(f1.delete());
//		返回文件或目录的绝对路径
		System.out.println(f1.getAbsolutePath());//D:\a
		File f2=new File("a.txt");
		System.out.println(f2.getAbsolutePath());//E:\eclipse-jee-photon-R-win32-x86_64\eclipse\java8\javase_day11\a.txt
//		返回文件或目录的相对路径
		System.out.println(f2.getPath());//a.txt
		System.out.println(f1.getPath());//D:\a
//		返回文件或目录名
		System.out.println(f2.getName());//a.txt
		System.out.println(f1.getName());//a
//		boolean equals(Object obj)	测试此抽象路径名与给定对象是否相等 
		File f3=new File("D:/c.txt");
		System.out.println(f1.equals(f2));//false
		System.out.println(f3.equals(new File("D:\\c.txt")));//true
		
//		String[] list() 返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组 
		File f4=new File("D:");
		String[] fileList=f4.list();
		System.out.println(Arrays.toString(fileList));
		
//		long length() 返回由此抽象路径名表示的文件的大小，以byte为单位  
		System.out.println(f3.length());//注意：UTF-8编码中的文件，首行有一个空白字符用来标注该文件时UTF-8编码
	}

}
