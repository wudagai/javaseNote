package com.nesoft.javase.flow;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
//		随机数
		Random r=new Random();
//		随机生成 -2^31~2^31-1的整型数值
		int messIntOne=r.nextInt();
		System.out.println("messIntOne:"+messIntOne);
//		随机生成0~10之间的数  包括0不包括10
		int messIntTwo=r.nextInt(10);
		System.out.println("messIntTwo:"+messIntTwo);
//		随机产生0~1之间的浮点型
		double messDouble=r.nextDouble();
		System.out.println("messDouble:"+messDouble);
//		随机生成0~10之间的数  包括0不包括10
		double dd=123.84234324;
		System.out.println((int)dd);//123
		System.out.println((int)(messDouble*10));
//		随机产生7~21的整型 包括7不包括21   21-7=14
		int messIntThree=r.nextInt(14)+7; //0~14  +7   7~21
		System.out.println("messIntThree:"+messIntThree);
		
		/*2、产生一个12以内的随机数作为月份，输出该月份的天数。
		1、3、5、7、8、10、12月天数为31
		2月天数为28
		4、6、9、11月天数为30*/
		int month=r.nextInt(12)+1;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("月份:"+month+"的天数为31");
				break;
			case 2:	
				System.out.println("天数为28");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("天数为30");
				break;
		 }


//		3、产生一个12以内的随机月份，和一个30以内的随机天数，输出该日是本年的第多少天（不考虑闰年）？【选做题】
		int day=r.nextInt(30)+1;//27   6
		if(month==1) {
			System.out.println("第"+(day)+"天");
		}else if(month==2) {
			System.out.println("第"+(31+day)+"天");
		}else if(month==3) {
			System.out.println("第"+(59+day)+"天");
		}
		else if(month==4) {
			System.out.println("第"+(90+day)+"天");
		}
		else if(month==5) {
			System.out.println("第"+(120+day)+"天");
		}
		else if(month==6) {
			System.out.println("第"+(151+day)+"天");
		}

	}

}
