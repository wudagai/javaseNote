package com.nesoft.javase.innerClass;
/**
 * 内部类：当一个类中的方法不足以完成某些功能又不想新建一个外部类完成时使用内部类
 * @author Administrator
 * 	成员内部类：
 * 			①在成员内部类中只能声明非静态资源，但是不能声明静态资源、
 * 			②成员内部类能访问外部类的所有静态资源和非静态资源
 * 
 * 静态内部类:
 * 		  ①静态内部类中能声明静态资源和非静态资源
 * 		  ②静态内部类只能访问外部类的静态资源，但是不能访问非静态资源
 * 		  
 *局部内部类：
 *		局部内部类特点：
 *			在一个类的方法体中或程序块内定义的内部类
 *			在方法定义的内部类中只能访问方法中的final类型的局部变量
 *
 *匿名内部类：
 *	没有定义类名的内部类，称为匿名内部类
 *	匿名内部类特点：
		匿名内部类没有访问修饰符。
		new 匿名内部类，这个类首先是要存在父类或接口。
		外部类方法形参或局部变量需要被匿名内部类使用，必须为final
 *		new 父类|接口(){    
     	//重写父类或接口的抽象方法    
		 }

 *
 *		
 */
public class Student {
//	静态变量
	static int age;
//	成员变量
	int sex=20;
//	成员方法
	public void show() {
		System.out.println("成员方法show ");
	}
//	静态方法
	public static void get() {
		System.out.println("静态方法get ");
	}
	

	public void getResult(int i) {
		final int a=20;
//		a=30;
//		局部内部类
		class LocalInnerClass{
			public String show() {
				System.out.println("局部内部类"+a);
				return "zhangsan";
			}
		}
		LocalInnerClass lic=new LocalInnerClass();
		String ss=lic.show();
		System.out.println(ss);
		
	}
	
	
//	成员内部类
	class Innerclass{
		String icname;
//		static int m; 编译报错
		int sex=10;
		public void showAll() {
			show();
			get();
			System.out.println("成员内部类showAll"+icname);
		}
		public void getName() {
//			showAll();
//			如果内部类和外部类中的变量同名时，调用的是内部类的变量，要想调用外部类的变量使用 [外部类.this]区分
//			System.out.println("成员内部类getName"+sex);
			System.out.println("成员内部类getName"+Student.this.sex); 
			System.out.println("成员内部类getName"+Student.age); 
		}
	}
//	静态内部类
	static class StaticInnerClass{
		String address;
		static int id;
		public void showAll(){
			System.out.println("静态内部类showAll"+age);
		}
		public static void getName(){
			System.out.println("静态内部类getName"+id);
		}
	}
	public static void main(String[] args) {
//		访问成员内部类:先实例化外部类再实例化内部类
//		Student s=new Student();
//		Innerclass ic=s.new Innerclass();
//		Innerclass ic=new Student().new Innerclass();
//		ic.showAll();
//		ic.getName();
//		访问静态内部类:通过类名实例化内部类
//		StaticInnerClass sic=new Student.StaticInnerClass();
//		sic.getName();
//		Student.StaticInnerClass.getName();
//		s.getResult(20);
		
//		匿名内部类在方法中使用抽象类或者接口行为
		Animal a=new Animal() {//创建匿名内部类
			
			@Override
			public void getName(int i) {
				System.out.println("匿名内部类"+i);
				
			}
		};
		a.getName(20);
		
	}

}
