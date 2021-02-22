package com.nesoft.javase.date;

import java.util.Calendar;
import java.util.Date;

/**
 *  常用的日期处理的对象。可以设置自己的时区和国际化格式。
	是一个抽象类。
	Calendar 抽象类定义了足够的方法，让我们能够表述日历的规则 
 * @author Administrator
 *
 */
public class TestCalendar {

	public static void main(String[] args) {
//		获取Calendar实例
		Calendar cld=Calendar.getInstance();
		System.out.println(cld);
		System.out.println(cld.YEAR);//1
//		获取时间
		System.out.println(cld.get(Calendar.YEAR));//2020 年
		System.out.println(cld.get(Calendar.MONTH));//11月   通过Calendar获取的月份比当前月份少一个月,12月份为0
		System.out.println(cld.get(Calendar.MONTH)+1);//12
		System.out.println(cld.get(Calendar.DATE));//8号
		System.out.println(cld.get(Calendar.HOUR));//10点
		System.out.println(cld.get(Calendar.DAY_OF_WEEK));//3 
//		设置时间
		cld.set(1995, 9, 12, 9, 56);
		System.out.println(cld.get(Calendar.HOUR));//9
		System.out.println(cld.get(Calendar.MONTH));//9
		
//		System.out.println(Calendar.YEAR);//1
		
//		返回Date
		Date dd=cld.getTime();
		System.out.println(dd);//Thu Oct 12 09:56:27 CST 1995

	}

}
