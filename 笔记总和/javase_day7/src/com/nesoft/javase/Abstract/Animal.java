package com.nesoft.javase.Abstract;
/**
 * abstract(抽象)：
 * 		1、修饰方法：抽象方法
 * 			①抽象方法没有方法具体的实现,简单来说就是没有方法体
 * 			②抽象方法是用来被重写的，所有不能使用static、fianl、private修饰抽象方法
 * 			③为什么要声明抽象方法：当你不知道某个方法具体的实现(这个方法的功能实现多种多样)，就可以将该方法声明成抽象方法
 * 		2、修饰类：抽象类
 * 			①一个类中有一个或多个抽象方法时，该类必然要声明成抽象类
 * 			②抽象类就是用来被继承的，所有抽象类不能用fina关键字修饰
 * 			③当一个类继承了抽象类，必然实现抽象类中的所有抽象方法，不然就声明成抽象类
 * 			④抽象类不能被实例化
 * 			⑤抽象类中的成员：
 * 				既能声明抽象方法也能声明非抽象方法
 * 				可以全都是抽象方法也可以全都是非抽象方法
 * 				***抽象类中除了能包含普通类中所有的成员外还能有抽象方法
 * 
 * 		    ⑥抽象类中有构造方法
 * 		3、什么时候一个类会被声明成抽象类
 * 			①当一个类中有抽象方法时
 * 			②当一个类继承抽象类没有实现(重写)完抽象类中的所有抽象方法时
 * 			③当一个类实现一个接口，并且不能为全部抽象方法都提供实现时；
 * @author Administrator
 *
 */
public  abstract class Animal {
//	成员变量
	String name;
//	静态变量
	static int age;
	
//	构造器
	public Animal() {
		System.out.println("Animal 的构造器");
	}
	
//	抽象方法
	public  abstract void eat();
	public  abstract void sleep();
	
//  成员方法：由子类调用
	public void getName() {
		System.out.println("Animal getName"+name);
	}
//	静态方法
	public static void getAge() {
		System.out.println("Animal getAge");
	}
	
	public static void main(String[] args) {
		Animal.getAge();
		
	}

}
