package com.nesoft.javase.date;

import java.util.Date;

/**
 * java.util.Date:java中的日期类，这个类里面的许多方法已经过时
 * java.sql.Date:数据库中的日期类
 * @author Administrator
 *
 */
public class TestDate {

	public static void main(String[] args) {
//		构造方法
		Date d=new Date();
		System.out.println(d);//Tue Dec 08 10:14:14 CST 2020
		System.out.println(new Date());
		
//		Date Date(long date)  使用给定的毫秒时间价值构建 Date对象。   在指定日期January 1, 1970, 00:00:00的基础上计算日期
		Date d1=new Date(1000);
		System.out.println(d1);//Thu Jan 01 08:00:01 CST 1970
		System.out.println(new Date(1000000000));//Mon Jan 12 21:46:40 CST 1970
		
		System.out.println(d.getHours());//10
//		Date类常用方法--比较日期
//		getTime() 返回日期的毫秒值
		System.out.println(d.getTime());//1607393961053
		
//		boolean after(Date when)	测试当前日期是否在指定日期之后 
		Date d2=new Date(90000);
		System.out.println(d2);
		if(d.after(d2)) {
			System.out.println("d 大于 d2");
		}else {
			System.out.println("d 小于于 d2");
		}
		
//		boolean before(Date when)	测试当前日期是否在指定日期之前
		if(d.before(d2)) {
			System.out.println("d 小于 d2");
		}else {
			System.out.println("d 大于 d2");
		}
		/**
		 * 比较两个日期的顺序。如果参数 Date 等于此 Date，则返回值 0；
		 * 如果此 Date 在 Date 参数之前，
		 * 则返回小于 0 的值；如果此 Date 在 Date 参数之后，则返回大于 0 的值。
		 */
//		int compareTo(Date anotherDate) 
		int flog=d.compareTo(d2);
		if(flog==0) {
			System.out.println("两个日期相等");
		}else if(flog<0) {
			System.out.println("d<d2");
		}else {
			System.out.println("d>d2");
		}
	}

}
