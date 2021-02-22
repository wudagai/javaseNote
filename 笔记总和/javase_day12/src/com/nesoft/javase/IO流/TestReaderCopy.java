package com.nesoft.javase.IO流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TestReaderCopy {
//	使用字符流完成文件拷贝
	public static void testCopyOne() {
//		创建文件实例
		File source=new File("D:/a.txt");//源文件
		File dest=new File("E:/b.txt");
//		搭建输入输出管道
		FileReader in=null;
		FileWriter out=null;
		try {
			in=new FileReader(source);
			out=new FileWriter(dest);
			int a=0;//用来接收读到的字符数据
			while((a=in.read())!=-1) {
				out.write(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	字符流使用场景：一般用于读写数据量较大的文本文件，不能读写二进制文件会导致文件损坏
	
	public static void testCopyTwo() {
//		创建文件实例
		File source=new File("D:/a.jpg");//源文件
		File dest=new File("E:/b.jpg");
//		搭建输入输出管道
		FileReader in=null;
		FileWriter out=null;
		try {
			in=new FileReader(source);
			out=new FileWriter(dest);
			int a=0;//用来接收读到的字符数据
			while((a=in.read())!=-1) {
				out.write(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	开辟字符数组进行读写
	public static void testCopyThree() {
//		创建文件实例
		File source=new File("D:/a.txt");//源文件
		File dest=new File("D:/b.txt");
//		搭建输入输出管道
		FileReader in=null;
		FileWriter out=null;
		try {
			in=new FileReader(source);
			out=new FileWriter(dest);
//			创建字符数组用于接收读取的字符数据
//			char[] c=new char[1024] 工业环境下
			char[] c=new char[6];
//			int len=in.read(c);//返回读到的字符个数
//			String mess="我爱你中国";
//			out.write(mess.toCharArray());
			int len=0;
			while((len=in.read(c))!=-1) {
//				读多少写多少
				out.write(c, 0, len);
//				什么时候使用flush:如果不想内存紧张可以马上flush或者想马上输出数据可以flush
				out.flush();//刷新数组中的数据，将数组中的数据马上输出
			}
//			out.flush();
//			System.out.println(Arrays.toString(c));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();//会默认调用flush方法刷新数组中的数据，这样的操作避免程序由于忘记flush二出现数据不输出的问题
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
//		testCopyOne();
//		testCopyTwo();
		testCopyThree();
	}

}
