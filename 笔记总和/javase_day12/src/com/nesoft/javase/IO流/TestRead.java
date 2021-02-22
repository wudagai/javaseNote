package com.nesoft.javase.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/**
 * 1、在D盘下创建a.txt文件，并在里面写上内容,使用字节输入流读取文件中的内容输出到控制台
 * @author Administrator
 *2、在D盘下创建a.txt文件，并在里面写上内容,使用字符输入流读取文件中的内容输出到控制台
 */
public class TestRead {
//	1、在D盘下创建a.txt文件，并在里面写上内容,使用字节输入流读取文件中的内容输出到控制台
//	字节输入流：一个一个字节的读取
	public static void testByteRead() {
//		①创建文件对象
		File source=new File("D:/a.txt");
		FileInputStream in=null;
		try {
//			②搭建输入管道
			in=new FileInputStream(source);
//			③通过管道读取内容进内存
			int a=in.read();//读一次，读到一个字节
			/*ASCIll编码  一个中文两个字节  数字和字母都是一个字节   
			 *UTF-8编码：一个中文三个字节  数字和字母都是一个字节
		              注意：UTF-8编码文件开头有一个空白字符标注该文件的字符集为UTF-8*/
//			④从内存中输出读到的内容到控制台			
			System.out.println(a);//49   1
			a=in.read();
			System.out.println(a);//50   2
			a=in.read();
			System.out.println(a);
			a=in.read();
			System.out.println(a);//97  a
			a=in.read();
			System.out.println(a);
			a=in.read();
			System.out.println(a);
			a=in.read();
			System.out.println(a); //文件中内容已经读完时返回-1  读不到内容返回-1 
  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();//流是非常消耗内存的，所以使用完之后要关闭
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	2、在D盘下创建a.txt文件，并在里面写上内容,使用字符输入流读取文件中的内容输出到控制台
//	注意使用字符流进行读写时，要保证字符集编码格式一致
	public static void testCharRead() {
		File source=new File("D:/a.txt");
		FileReader in=null;
		try {
			in=new FileReader(source);
			int a=in.read();//一个一个字符读
			System.out.println((char)a);
			a=in.read();
			System.out.println((char)a);
			a=in.read();
			System.out.println((char)a);
			a=in.read();
			System.out.println((char)a);
			a=in.read();
			System.out.println((char)a);
			a=in.read();
			System.out.println(a);//20013 中
			a=in.read();
			System.out.println(a);//22269 国
			a=in.read();
			System.out.println(a);//-1 找不到返回-1

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			閸忔娊妫村ù锟�?
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
//		testByteRead();
		testCharRead();

	}

}


