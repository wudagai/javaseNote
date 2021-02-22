package com.nesoft.javase.method;
/**
 * 方法的分类
 * 
 * @author Administrator
 * 注意：
 * 	①方法是定义在类中，方法中不能再定义方法，一个类中可以定义多个方法
 *  
 *
 */
public class MethodCategory {
//	方法的定义
	/**
	 * 无参无返回值
	 * void:表示这个方法没有返回值
	 * getName：方法名
	 */
	public void getName() {
		System.out.println("无参无返回值的方法");
	}

	/**
	 * - 无参有返回值
	 * String:标注这个方法的返回值的类型为String类型
	 * getAddress:方法名
	 * return：调用该方法得到的返回值
	 * @return
	 * 注意：
	 * ①return的结果数据类型必须和方法声明时的数据类型保持一致，可以是变量也可以是常量
	 * ②有返回值的方法必须执行return,而且只能执行一次retrun语句
	 * ③return是方法的结束标志
	 * ④返回值只能有一个
	 */
	public String getAddress() {
		String address="东软";
		if(1<2) {
			return address;
//			System.out.println("000"); 编译不通过
		}
		System.out.println("00000");
		return address;
	}

	/**
	 *  有参无返回值
	 * @param name
	 * name:形式参数  String：参数的数据类型
	 *  注意：
	 *  ①一个方法可以有多个参数,参数之间使用","隔开
	 *  ②参数可以是基本数据类型也可以是引用数据类型
	 *  ③形式参数是局部变量,其生命周期(作用域)在声明的方法体内
	 *  ④参数在方法被调用时完成初始化工作
	 */
	public void getAge(String name) {
		System.out.println(name+"有参无返回值的方法");
	}
	public void getSex(int age,int[] nos) {
		System.out.println(age+"有参无返回值的方法");
			
	}
	
	/**
	 *  有参有返回值
	 * @param age 参数
	 * @return :方法的返回值
	 */
	public int getEmpno(int age) {
		age+=80;
		return age;	
		
	};
	public String getEname(int age) {
		
		return null;	
		
	};

	public static void main(String[] args) {

	}

}
