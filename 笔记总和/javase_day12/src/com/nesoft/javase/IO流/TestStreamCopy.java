package com.nesoft.javase.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 在D盘下创建a.txt文件，并在里面写上内容,使用字节输入流读取文件中的内容并使用字节输出流输出到D：/b.txt(文件拷贝)
 * @author Administrator
 *
 */
public class TestStreamCopy {
//	使用字节流完成文件拷贝
	public static void testCopeOne() {
//		创建文件实例
		File source=new File("D:/a.txt");//源文件
		File dest=new File("E:/b.txt");
//		搭建输入输出管道
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
//			通过输入输出管道完成文件的读写:读一次写一次
			in=new FileInputStream(source);
//			out=new FileOutputStream(dest);
			out=new FileOutputStream(dest,true);//将数据追加到目标文件中
			/*int a=in.read();
			out.write(a);
			a=in.read();
			out.write(a);
			a=in.read();
			out.write(a);
			a=in.read();
			out.write(a);*/
//			读多少写多少
			int a=0;//用来保存读到的字节
			while((a=in.read())!=-1) {
				out.write(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				关闭流
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
//	使用字节流完成文件拷贝--字节数组
	public static void testCopeTwo() {
//		创建文件实例
		File source=new File("D:/a.txt");//源文件
		File dest=new File("D:/b.txt");
//		搭建输入输出管道
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
//			通过输入输出管道完成文件的读写:读一次写一次
			in=new FileInputStream(source);
			out=new FileOutputStream(dest);
//			byte[] b=new byte[1024];//工业环境下是1024
			byte[] b=new byte[6];
//			将数据读到字节数组中,一次读一个数组
	/*		int len=in.read(b);//返回读到的字节个数
			System.out.println(len);//6
			System.out.println(Arrays.toString(b));//[97, 98, 99, 100, 101, 102]
			len=in.read(b);
			System.out.println(Arrays.toString(b));//[103, 104, 105, 106, 107, 108]
			System.out.println(len);//6
			len=in.read(b);
			System.out.println(len);//2
			System.out.println(Arrays.toString(b));//[109, 110, 105, 106, 107, 108]
			len=in.read(b);
			System.out.println(len);//-1 读不到返回-1
*/			
//			一边读一边写
			int len=0;
			while((len=in.read(b))!=-1) {

//				out.write(b);
//				读到多少就写多少
				/**
				 * b：源数组
				 * off：数组的开始索引，从哪里开始
				 * len：长度
				 */
				out.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				关闭流
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
//	一般字节流用于读写二进制文件比如：音频、视频、图片等
	public static void testCopeThree() {
//		创建文件实例
		File source=new File("D:/a.jpg");//源文件
		File dest=new File("E:/feizhuliu.jpg");
//		搭建输入输出管道
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
//			通过输入输出管道完成文件的读写:读一次写一次
			in=new FileInputStream(source);
			out=new FileOutputStream(dest);
			byte[] b=new byte[1024];
//			将数据读到字节数组中,一次读一个数组
//			一边读一边写
			int len=0;
			while((len=in.read(b))!=-1) {
				out.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				关闭流
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
//		testCopeOne();
//		testCopeTwo();
		testCopeThree();
	}

}
