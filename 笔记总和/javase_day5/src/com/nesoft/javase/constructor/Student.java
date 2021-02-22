package com.nesoft.javase.constructor;
/**
 * 构造器(构造方法)：初始化对象
 * 	构造方法也是方法，但是它是特殊的方法而已
	所有的对象都是通过构造器来初始化的
	对象创建完成时也完成了初始化工作
 * 
 * 特点:
 * 	①没有返回值也没有void
 * 	②方法名和类名一样
 * 	③不能在方法中用return语句返回一个值
 *注意：
 *	①在Java中，每个类都至少要有一个构造器
 *	②当一个类中没有构造方法时,编译器会默认调加一个无参的构造方法
 *	③构造方法可以重载,如果一个类中有了构造方法那么编译器不会再自动提供无参构造方法，一般我们会自己提供无参构造方法
 * 	④调用无参构造方法可以初始化对象赋默认值给成员变量，调用有参构造方法也可以完成对象初始化同时可完成成员变量的赋值
 * @author Administrator
 *
 */
public class Student {
	String stuName;
	int age;
	double grade;

//	无参构造方法
	public Student() {
		System.out.println("无参构造器");
	}
	
	public Student(int age) {
		System.out.println("有参的构造方法");
	}
//	有参构造方法的作用：初始化对象的同时完成成员变量的赋值(自定义的值)
	public Student(int age,double grade,String stuName) {
		this.stuName=stuName;
		this.age=age;
		this.grade=grade;
		
	}
	
//	public void Student() {
//		System.out.println("成员方法");
//	}
//	构造代码块(成员代码块)
	{
//		stuName="zhangsan";
		System.out.println("构造代码块");
	}
	
	public String getResult() {
		return "["+stuName+","+age+","+grade+"]";
	}
	
	public static void main(String[] args) {
		/**
		 * new:内存空间分配符
		 * Student():调用构造方法
		 */
		Student s1=new Student(10);
		s1.age=20;
		s1.stuName="zhangsan";
		s1.grade=90.9;
		
		System.out.println("s1:"+s1.getResult());
		Student s2=new Student(10);
		System.out.println("s2:"+s2.getResult());
		
		Student s3=new Student(20,99.99,"lisi");
		System.out.println("s3:"+s3.getResult());

    }
}
