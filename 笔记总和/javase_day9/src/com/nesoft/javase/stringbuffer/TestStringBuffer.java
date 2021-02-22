package com.nesoft.javase.stringbuffer;

import java.util.Arrays;

public class TestStringBuffer {

	public static void main(String[] args) {
//		StringBuffer的构造器及方法
		/**
		 * 缓冲区:可变的内存空间
		 * 		扩容的算法：先确定初始容量n，如果append方法添加字符串超过容量之后 容量扩容到2n+2
		 * 		         ,如果容量还不够存放添加进缓冲区的字符串那么 将当前的容量设为n继续扩容2n+2
		 */
		
//		构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符，如果存放的字符超过16个会自动扩容
		StringBuffer sb1=new StringBuffer();
//		capacity():返回缓冲区容量
		System.out.println(sb1.capacity());//16
//		append方法：将字符拼接到字符串缓区中
		sb1.append("zhangsan");
		System.out.println(sb1);//zhangsan
		sb1.append("wangwu");
		System.out.println(sb1);//zhangsanwangwu
		System.out.println(sb1.capacity());//16
		sb1.append("lis");
		System.out.println(sb1.capacity());//34
		sb1.append("qwertyuioplkjhgfds");
		System.out.println(sb1.capacity());//70
		
//		构造一个不带字符，但具有指定初始容量的字符串缓冲区。
		StringBuffer sb2=new StringBuffer(3);
		System.out.println(sb2.capacity());
		sb2.append("zhangsan");
		System.out.println(sb2);//zhangsan
		System.out.println(sb2.capacity());//8
		
//		构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。 初始容量： 16+n  n:字符串的长度
		StringBuffer sb3=new StringBuffer("zhang");
		System.out.println(sb3);
		System.out.println(sb3.capacity());//21 
		sb3.append("lisi");
		System.out.println(sb3.capacity());//21 
		
//		int  capacity( )	返回当前容量 
//		int  length( )	返回长度（字符数）
//		StringBuffer  reverse( )	将此字符序列用其反转形式取代  用于判断回文数
		StringBuffer sb=new StringBuffer("12345");
		sb.reverse();
		System.out.println(sb);//54321
		/**
		 * 判断某个数是否是回文数
		 */
		sb=new StringBuffer("12321");
		if((sb.toString()).equals((sb.reverse()).toString())) {
			System.out.println("sb是回文数");
		}
//		StringBuilder
		
//		void  setCharAt(int,char)	将给定索引处的字符设置为 ch 
		sb=new StringBuffer("wu.yuehong.com");
		sb.setCharAt(2, '@');
		System.out.println(sb);//wu@yuehong.com
		
//		StringBuffer  delete(int begin,int end)	移除此序列的子字符串中的字符   包含开始索引不包含结束索引
		sb.delete(2, 10);
		System.out.println(sb);//wu.com
//		char  charAt(int)	返回此序列中指定索引处的 char 值 
//		String  toString( )	将StringBuffer对象转换成相应的String
//		StringBuffer  append(String  str)	将指定的字符串追加到此字符序列 
		
//		StringBuffer  append(int  num)	将 int 参数的字符串表示形式追加到此序列 
		sb.append(true);
		System.out.println(sb);//wu.comtrue
		sb.append(123);
		System.out.println(sb);//wu.comtrue123
//		StringBuffer  append(Object o)	追加 Object 参数的字符串表示形式 
		int[] i= {1,2,3};
//		System.out.println(i.toString());
		System.out.println(Arrays.toString(i));//[1, 2, 3]
		sb.append(i);
		System.out.println(sb);//wu.comtrue123[I@7852e922
		sb.append(Arrays.toString(i));
		System.out.println(sb);//wu.comtrue123[I@7852e922[1, 2, 3]
		
//		StringBuffer  insert(int index,String str)	将字符串插入此字符序列中 index:索引位置  str：添加的字符串
		sb.insert(2, "zhang");
		System.out.println(sb);
//		StringBuffer  insert(int index,char ch)	将字符插入此字符序列中 
//		StringBuffer  insert(int index,Object o)	将 Object 参数的字符串表示形式插入此字符序列中 
	}

}
