package com.nesoft.javase.flow;

public class TestSwitch {

	public static void main(String[] args) {
		/**
		 * switch:相当于if()else if()..else{}
		 * 
		 * switch (表达式){
			case 取值1：
			    语句块1 
			   [break]                      
			    …
			case 取值n：
			    语句块n   
			    [break]                     
			default:          
			    语句块n+1                    
     		}
		 * 注意：
		 * 	①表达式的值只可以接受四个基本数据类型和对应包装类（int、byte、char、short） 、String型(JDK1.7之后)、枚举型
		 *  ②switch case中的值必须要与switch表达式的值具有相同的数据类型。而且case后跟的值必须是常量，不能跟变量
		 *  ③不允许有重复的case取值
		 *  ④switch一旦碰到第一次case匹配，程序就会跳转到这个标签位置，开始顺序执行以后所有的程序代码，
		 *  	而不管后面的case条件是否匹配，直到碰到break关键字或者结束switch语句的大括号为止
		 *  ⑤如果没有case与表达式匹配执行default
		 *  ⑥switch什么时候结束？
		 *  	遇到了第一个break关键字或者结束switch语句的大括号。
		 *  ⑦case之间与default没有顺序。先判断所有的case，没有匹配的case执行default。因此一般将default放在case后面。

		 *  
		 */
//		需求：20~30 奖金为1000  30~40 奖金为2000 40~50 奖金为3000  50~70奖金为4000
		int age=62;
		int level=age/10;
//		switch(level) {
//		default:
//			 System.out.println("奖金为0");
//		 case 2 :
//			 System.out.println("奖金为1000");
//			 break;
//		 case 3 :
//			 System.out.println("奖金为2000");
//			 break;
//		 case 4 :
//			 System.out.println("奖金为3000");
//			 break;
//		 case 5 :
//			 System.out.println("奖金为4000");
//			 break;
//		 case 6 :
//			 System.out.println("奖金为4000");
//			 break;
//		 
//		}
		
		switch(level) {
		
		 case 2 :
			 System.out.println("奖金为1000");
			 break;
		 case 3 :
			 System.out.println("奖金为2000");
			 break;
		 case 4 :
			 System.out.println("奖金为3000");
			 break;
		 case 5 :
		 case 6 :
			 System.out.println("奖金为4000");
			 break;
		 default:
			 System.out.println("奖金为0");
		}
	}

}
