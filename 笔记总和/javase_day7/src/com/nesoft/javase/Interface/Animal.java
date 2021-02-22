package com.nesoft.javase.Interface;
/**
 * 动物接口
 * 接口的意义：变相的实现了多继承,一个类只能继承一个父类，但是可以实现多个接口
 * 			接口中都是行为动作，所以接口就是一套行为协议
 * @author Administrator
 * 	注意：
 * 		①接口不是类，没有构造方法，不能实例化
 * 		②接口中只能声明静态方法和抽象方法，jdk1.8之后有默认的方法
 * 		③接口中不能有成员变量，只有常量默认修饰为  public final static 数据类型 常量名  访问修饰符只能是public
 * 		④接口中的抽象方法默认修饰为 public abstract 返回值 方法名();  访问修饰符只能是public
 *
 *  接口中的成员：常量、静态方法、抽象方法、默认的方法
 *  		默认方法(jdk1.8之后)：提供一种拓展接口的方法，而不破坏现有代码
 *  		语法：defalut public 返回值类型 方法名(){}
 *  
 *  接口的使用：
 *  	①接口就是用来被实现的，一个类实现接口必然实现(重写)接口中所有的抽象方法   class 类名 implements 接口名
 *  	②一个类能实现多个接口的同时继承一个类
 *  	③接口可以实现多继承：一个接口继承其他接口该接口就拥有其他接口的所有抽象方法
 *  		[修饰符]  interface   接口名 extends 接口1,接口2{接口的成员 }                    
                    

 *  接口和类的关系：
 *  	类用来实现接口
 *  	如果一个类要实现一个接口，那么这个类就必须实现接口中所有抽象方法。否则这个类只能声明为抽象类
 *  	多个无关的类可以实现一个接口，一个类可以实现多个无关的接口
	
	
 * 接口的作用：
 * 	         结构化设计中提倡高内聚低耦合，如果程序的耦合度高不利于功能的扩展和后期的维护
 * 		内聚：模块内各个组件之间联系的紧密程度 
 * 		耦合：模块与模块之间联系的紧密程度
 * 	     **降低模块间或系统间的耦合性
 */
public interface Animal {
	
	
	int age=20;  // public final static  int age=20
	
	public int sex=30;// public final static  int sex=20

	
	public static void getName() {
		System.out.println("接口中的静态方法");
	}
/*	public void setName() {
		编译错误
	}*/
	public abstract void getAge() ;
	
	String eat(); //public abstract String eat()
	
	public void sleep(int mills); 
	
//	public void fly();
	default public void fly() {
		
	}
	
	public static void main(String[] args) {
		Animal.getName();
	}
	

}
