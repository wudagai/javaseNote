package com.nesoft.javase.Static;
/**
 * 成员方法和成员变量声明在类中,必须实例化之后才能调用,成员方法可以直接调用成员变量个方法
 *静态方法和静态变量声明在类中,类加载的时候完成初始化
	 * 静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，
	 * 它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化
	 * ，存在多个副本，各个对象拥有的副本互不影响
 * static:静态   所有对象共享,类级别
 * 	 修饰的元素：
 *   	修饰变量：静态变量(类变量)
 *   		访问：
 *   			①实例化后使用引用加"."点运算符访问
 *   			②通过类名加"."运算符直接访问
 *   	修饰方法：静态方法(类方法)
 *   			①实例化后使用引用加"."点运算符访问
 *   			②通过类名加"."运算符直接访问
 *   
 *   	修饰代码块：静态代码块
 * 
 * 注意：①用static修饰的属性，它们在类被载入时创建，只要类存在，static变量就存在。 
 * 	  ②类加载只会执行一次，而可以实例化多次
 * 	  ③类加载是在对象实例化之前就完成了，类加载是完成了静态资源(静态变量和静态方法)的初始化
 * @author Administrator
 *特别注意：
 *	  ①成员方法能直接访问成员方法和成员变量
 *	  ②成员方法能直接调用静态方法和静态变量
 *	  ③静态方法不能直接调用成员方法和成员变量
 *	  ④静态方法能直接调用静态方法和静态变量
 *	  ⑤在静态方法中不能使用this和super关键字
 *	  ⑥static不能修饰构造器
 *
 */
public class Student {
//	成员变量
	int age;
//	静态变量
	static int sex;
	
//	成员方法
	public void getName() {
		this.age=20;//当前实例化对象
		System.out.println("成员方法"+",age:"+age+",sex"+sex);
		getSex();
	}
//  静态方法
	public static void getSex() {
//		this.age 在静态方法中不能使用this和super关键字
//		System.out.println(age);//编译不通过
//		getName();//编译不通过
		System.out.println("静态方法"+sex);
	}
	
	public static void main(String[] args) {
//		System.out.println(Student.sex); //0
		
	}

}
