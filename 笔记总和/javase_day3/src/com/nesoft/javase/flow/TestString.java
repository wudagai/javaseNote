package com.nesoft.javase.flow;

import java.util.Scanner;

/**
 * String类：
 *  字符串： 由字符序列组成  ,属于引用数据类型
 * @author Administrator
 *
 */
public class TestString {

	public static void main(String[] args) {
		/*String s1="zhangsan";
		System.out.println("s1:"+s1);
//		数值与字符串计算时得到的结果为字符串  ：字符串的拼接
		System.out.println(s1+8);//zhangsan8
		System.out.println("zhangsan"+8+9);//zhangsan89
		System.out.println(8+9+"zhangsan");//17zhangsan
		System.out.println("--------------------------------");*/

		Scanner sc=new Scanner(System.in);
//		接收控制台输入		
//		int messageInt=sc.nextInt();//该方法会阻塞(等待),等待控制台的输入的Int数据，当控制台输入完成并回车阻塞解除
//		double messageDouble=sc.nextDouble();
//		String messageString=sc.next();//该方法会阻塞(等待),等待控制台的输入的字符串以空格为结束标志，当控制台输入完成并回车阻塞解除
		String messageString=sc.nextLine();//该方法会阻塞(等待),等待控制台的输入的一行字符串以回车为结束标志，当控制台输入完成并回车阻塞解除
//		输出到控制台
//		System.out.println("messageInt:"+messageInt);
//		System.out.println("messageDouble:"+messageDouble);
		System.out.println("messageString:"+messageString);


	}

}
