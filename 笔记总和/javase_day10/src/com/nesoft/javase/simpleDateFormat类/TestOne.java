package com.nesoft.javase.simpleDateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String与Date之间互相转换，使用simpleDateFormat类
 * 
 * @author Administrator
 *
 */
public class TestOne {
	public static Date stringToDate(String dateString) {
		/**
		 * 语法
		 * SimpleDateFormat sf=new SimpleDateFormat(格式化日期格式)
		 *  注意：
		 *  	parse(String dd)方法将字符串转日期
		 *  	dd中的日期格式必须和格式化日期格式一致
		 *  	
		 */
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh");
		try {
			Date d=sf.parse(dateString);
			return d;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static String dateToString(Date d) {
//		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S E a");
//		SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss S E a");
//		SimpleDateFormat sf=new SimpleDateFormat("yyyy\\MM\\dd HH:mm:ss S E a");
		SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒");
		String s=sf.format(d);
		return s;
		
	}
	public static void main(String[] args) {
		String dateString="1995-12-10 12";
		System.out.println(dateString);
//		调用String转Date的方法
		Date d=stringToDate(dateString);
		System.out.println(d);
		
		Date dd=new Date();
		System.out.println(dd);
//		调用Date转String的方法
		System.out.println(dateToString(dd));//2020-12-08 11:12:18 998 星期二 上午
	}

}
