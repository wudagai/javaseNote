package com.nesoft.javase.string;

import java.util.Arrays;

public class TestStringMethod {
	public static void main(String[] args)  {
//		String 类中的方法
//		boolean  equals(String)	判断两个字符串对象的内容是否相等
		
//		boolean  equalsIgnoreCase(String)	比较两个字符串的内容是否相等，忽略大小写
		String s1="ZHangSan";
		if("zhangsan".equalsIgnoreCase(s1)) {
			System.out.println("用户名正确");
		}
//		String toUpperCase( )	将String对象中的所有字符都转换为大写 ,返回新的字符串
		String s2=s1.toUpperCase();
		System.out.println(s1);//ZHangSan
		System.out.println(s2);//ZHANGSAN
//		String toLowerCase( )	将String对象中的所有字符都转换为小写 ,返回新的字符串
		
		String s3="wu.yuehong.com";
//		int length() 返回字符串的长度
		System.out.println(s3.length());//14
		 
//		char  charAt(int)	返回指定索引处的 char值,字符串是由索引的，索引从0开始  索引最大为length-1	
		char c=s3.charAt(0);
		System.out.println("c:"+c);//w
//		c=s3.charAt(14);
//		System.out.println("c:"+c);//String index out of range: 14
		
//		String substring(int begin)	返回一个新字符串，该字符串是从begin开始的字符串的内容,包含开始索引
//		s3=s3.substring(0);
//		System.out.println("s3:"+s3);//wu.yuehong.com
//		s3=s3.substring(1);
//		System.out.println("s3:"+s3);//u.yuehong.com
		
//		String substring(int begin,int end)	返回一个新字符串，该字符串是从begin开始到end-1结束的字符串的内容，不包含结束索引
//		s3=s3.substring(3, 5);
//		System.out.println("s3:"+s3);//yu
//		s3=s3.substring(3,14);
//		System.out.println(s3);//yuehong.com

	
//		int   indexOf/lastIndexOf(char)	返回指定字符在此字符串中第一次/最后一次出现处的索引。 如果没有找到返回-1
//		String s3="wu.yuehong.com";
		System.out.println(s3.indexOf('.'));//2
		System.out.println(s3.indexOf('x'));//-1
		System.out.println(s3.lastIndexOf('.'));//10
		
//		int   indexOf/lastIndexOf(char,int)	从指定的索引开始搜索，返回在此字符串中第一次/最后一次出现指定字符处的索引
//		indexOf从左往右找
		System.out.println(s3.indexOf('.',2));//2
		System.out.println(s3.indexOf('.',3));//10
		System.out.println(s3.indexOf('.',-1));//2  如果第二参数为负数开始索引为0
//		lastIndexOf 简单来说从右往左找字符第一次出现的位置
		System.out.println(s3.lastIndexOf('.',0));//-1
		System.out.println(s3.lastIndexOf('.',-1));//-1
		System.out.println(s3.lastIndexOf('.',3));//2
		System.out.println(s3.lastIndexOf('.',2));//2
		System.out.println(s3.lastIndexOf('.',5));//2
		System.out.println(s3.lastIndexOf('.',13));//10
		System.out.println(s3.lastIndexOf('.',9));//2
		
//		int   indexOf/lastIndexOf(String)	返回第一次出现的指定子字符串在此字符串中的索引
//		String s3="wu.yuehong.com";
		System.out.println(s3.indexOf("wu"));//0
		System.out.println(s3.indexOf(".y"));//2
//		int   indexOf/lastIndexOf(String,int)	从指定的索引开始搜索，返回在此字符串中第一次/最后一次出现指定字符串处的索引
		System.out.println(s3.indexOf(".y",0));//2
		System.out.println(s3.indexOf(".yue",2));//2
		System.out.println(s3.indexOf(".yue",3));//-1

//		String trim( )	返回新的字符串，忽略前导空白和尾部空白  
		System.out.println(s3.trim());//wu.yuehong.com
		String username ="    ";
//		非空判断
		if(username.trim()!=null && !"".equals(username.trim())) {
			System.out.println("用户名不为空");
		}else {
			System.out.println("用户名为空");

		}
//		int   length( )	返回此字符串的长度	
//		String   concat(String str) 	将指定字符串连接到此字符串的结尾 ,返回新的字符串
		String s4="zhangsan";
		s4=s4.concat("lisi");
		System.out.println(s4);//zhangsanlisi
//		byte[]   getBytes()	使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
//		byte[]  getBytes(Charset charset) 	使用给定的 charset将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组
		
//		String[] split(String regex) 	根据给定正则表达式的匹配拆分此字符串。字符串劈开
		String dateString="1997-12-20";
		String[] ss= dateString.split("-");
		System.out.println(Arrays.toString(ss));
		System.out.println("年："+ss[0]);//1997
		
		dateString="1997 12 20";
		ss=dateString.split(" ");
		System.out.println(Arrays.toString(ss));//[1997, 12, 20]
		
		dateString="      1997    12   20     ";
		ss=dateString.split(" ");
		System.out.println(Arrays.toString(ss));//[, , , , , , 1997, , , , 12, , , 20]

//		String  replace(char oldChar, char newChar) 	返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的
		String s5="zhangsan你太laji";
		System.out.println(s5.replace("laji", "***"));//zhangsan你太***
//		boolean  startsWith(String prefix) 	测试此字符串是否以指定的前缀开始,判断文件名或者反问路径
		String s6="a.jpg";
		System.out.println(s6.startsWith("a"));//true
//		success.html
		s6="success.html";
		if(s6.startsWith("success")) {
			System.out.println("访问success.html");
		}
		
//		boolean   endsWith(String suffix) 	测试此字符串是否以指定的后缀结束
		if(s6.endsWith(".jpg")) {
			System.out.println("是jpg图片");
		}
	}

}
