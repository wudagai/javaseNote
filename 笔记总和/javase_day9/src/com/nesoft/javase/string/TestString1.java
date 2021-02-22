package com.nesoft.javase.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestString1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		字符串的创建： String类构造方法
//		方式一：
		String s1="zhangsan";
		s1=null;
		System.out.println("s1:"+s1);//空值
		s1="";
		System.out.println("s1:"+s1);//空串
		s1=" ";
		System.out.println("s1:"+s1);//空格
//		方式二：
		String s2=new String("zhangsan");
//		s2=new String(null); 编译错误
		s2=new String();
		System.out.println("s2:"+s2);//空串
//		方式三：  char[]-String String( char chars[ ])	使用一个字符数组创建一个String对象。
		char[] c= {'中','国','我','爱','你'};
		System.out.println(Arrays.toString(c));//[中, 国, 我, 爱, 你]
		String s3=new String(c);
		System.out.println("s3："+s3);//中国我爱你
		
//		方式四：String( char chars[ ], int startIndex, int numChars) 
		/**
		 * chars[ ]字符数组	startIndex 开始索引   numChars字符数 :包含开始索引
		 */
		s3=new String(c,2,3);
		System.out.println("s3："+s3);//我爱你
//		String--char[]  toCharArray()方法
		c=s3.toCharArray();
		System.out.println(Arrays.toString(c));//[我, 爱, 你]
		
		
		
//		String--byte[]  编码   通过getBytes()方法
		String s4="我爱你中国"; 
//		Unicode(UTF-8)编码下：一个中文三个字节  GBK(gb-2312):一个中文两个字节
		byte[]  b=s4.getBytes();//使用当前项目字符集进行编码 
		System.out.println(Arrays.toString(b));//[-26, -120, -111, -25, -120, -79, -28, -67, -96, -28, -72, -83, -27, -101, -67]
		b=s4.getBytes("gbk");//使用指定字符集进行编码 
		
		System.out.println(Arrays.toString(b));//[-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]
//		方式五：byte[] --String 解码  String( byte asciiChars[ ])	       使用一个字节数组创建一个String对象
		s4=new String(b); //使用当前项目字符集进行解码 
		System.out.println(s4);//�Ұ����й�
//		注意：使用什么字符集进行编码就需要用对应的字符集进行解码
		s4=new String(b,"gbk");//使用指定字符集进行解码
		System.out.println(s4);//我爱你中国
		
//		方式六：String(StringBuffer buffer)         使用StringBufffer对象中的内容为该对象初始化。
		StringBuffer sb=new StringBuffer("我爱你中国"); //String --StringBuffer
		System.out.println(sb);
		
//		StringBuffer--String
		String s5=new String(sb);
		System.out.println(s5);//我爱你中国
		


	}

}
