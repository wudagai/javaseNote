package com.nesoft.javase.File类;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
//		文件对象的创建
		
//		File(File parent, String child)创建从一个家长的抽象路径名和一个孩子的路径字符串的新 File实例。  
		File parent=new File("D:/");
		File source=new File(parent,"a.txt");
		System.out.println(source);//D:\a.txt
//		如果文件不存在那么在磁盘中创建该文件
		if(!source.exists()) { //判断文件是否真的存在
			try {
				source.createNewFile();//创建空白文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		parent=new File("D:/pic");
		source=new File(parent,"b.txt");
		if(!source.exists()) { //判断文件是否真的存在
			try {
				source.createNewFile();//创建空白文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

//		File(String pathname) 通过将给定的路径名的字符串转换成一个抽象路径名创建一个新的 File实例。
		source=new File("D:\\b.txt");
		if(!source.exists()) { //判断文件是否真的存在
			try {
				source.createNewFile();//创建空白文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		File(String parent, String child) 
//		创建从父路径名的字符串和一个孩子的一个新的 File实例文件。
		source=new File("D:/","c.txt");
		if(!source.exists()) { //判断文件是否真的存在
			try {
				source.createNewFile();//创建空白文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		当前工程根目录下创建文件实例a.txt
		source=new File("a.txt");
		if(!source.exists()) { //判断文件是否真的存在
			try {
				source.createNewFile();//创建空白文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		创建文件夹对象
//		在D盘下创建image文件夹
		source=new File("D:/image");
		if(!source.exists()) { //判断文件是否真的存在
			source.mkdir();//创建单级目录
		}
//		在D盘下创建a/b/c文件夹
		source=new File("D:/a/b/c");
		if(!source.exists()) { //判断文件是否真的存在
			source.mkdirs();//创建单级或多级目录
		}
//		在刚刚创建的a/b/c文件夹下新建一个空白文件 x.txt
		source=new File(source,"x.txt");
		if(!source.exists()) { //判断文件是否真的存在
			try {
				source.createNewFile();//创建空白文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		在当前工程根目录下创建pic文件
		source=new File("pic");
		if(!source.exists()) { //判断文件是否真的存在
			source.mkdirs();//创建单级或多级目录
		}
	}

}
