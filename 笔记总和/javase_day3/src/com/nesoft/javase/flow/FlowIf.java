package com.nesoft.javase.flow;
/**
 * if语句
 * @author Administrator
 *
 */
public class FlowIf {
	public static void main(String[] args) {
//		单一条件
		/**
		 * 语法：
		 * 	if(A){
		 * 		语句块B;
		 * 	}
		 * 如果A为true执行B,否者不执行
		 * 注意：A的返回值必须是布尔值
		 */
		/*if(1<2) {
			System.out.println("1<2");
		}*/
		if(2<1)
			System.out.println("2<1");
		System.out.println("哈哈");
		
		System.out.println("---------------------------------------------");
//		二选一
		/**
		 * 语法：
		 * if(A){
		 * 	 语句块B
		 * }else{
		 * 	语句块C
		 * 
		 * }
		 * 如果A为true执行B,否者执行C
		 * 
		 */
	/*	if(4<3) {
			System.out.println("4<3 true");
		}else {
			System.out.println("4<3 false");
		}*/
		int money=20000;
		boolean home =true;
		if(money>200000 || home) {
			System.out.println("我们结婚吧");
		}else {
			System.out.println("你是个好人");
		}
		System.out.println("--------------------------------------------------");
		
//		多分支条件
		/**
		 * 语法：
		 * 	if(A){
		 * 	   语句块B;
		 * 	}else if(A1){
		 * 	   语句块C;
		 * }else if(A2){
		 * 	 语句块D;
		 * }...
		 *  else{
		 *     语句块F;
		 * 
		 *  }
		 *  如果A为true执行B,整个分支条件判断语句结束,否者继续判断A1,如果A1为true执行C，整个分支条件判断语句结束，否者继续判断A2以此类推，
		 *  如果分支条件都为false,那么执行else中的语句块F
		 */
		int week=7;
		if(week==1) {
			System.out.println("星期一写代码");
		}else if(week==2) {
			System.out.println("星期二写代码");
		}else if(week==3) {
			System.out.println("星期三熬夜写代码");
		}
		else if(week==4) {
			System.out.println("星期四通宵写代码");
		}else if(week==5) {
			System.out.println("星期五辞职不写代码");
		}else {
			System.out.println("有一个好周末");
		}
		System.out.println("---------------------------------------------");
//		判断2064年是不是闰年。
//		闰年判断规则：
//		能被400整除的是闰年
//		能被100整除，不能被400整除的不是闰年
//		能被4整除，不能被100整除的是闰年
//		其他的不是闰年
		int year=2064;
		if(year%400==0 || (year%4==0&& year%100!=0)) {
			System.out.println("是闰年");
		}else {
			System.out.println("不是闰年");
		}
	}

}
