package com.nesoft.javase.superAndThis;
/**
 * super和super()
 * 		super:父类引用，父类再内存中的地址
 * 		         可以通过super对父类中的属性进行赋值
 * super([参数])：父类构造器
 * 				①super([参数])中不带参数时调用的是父类无参构造方法，根据参数判断调用的构造方法
 * 				②因为调用子类构造器时必定先调用父类构造器，所有当子类中没有使用super([参数]),
 * 					编译器默认在其第一行加上super()无参的父类构造器
 * 				③如果父类中没有无参构造器，那么子类中声明的构造器就会编译报错
 * 					解决方案：①在子类构造器中显示的调用父类中已有的构造方法
 * 							②在父类中提供无参构造方法(建议)
 * 
 * 				④super([参数])一定在构造器的第一行
 * 				⑤super()和this()不能同时声明在同一个构造其中
 * 				⑥如果构造方法中有了this(),编译器就不会默认加上super()
 * @author Administrator
 *
 */
public class Cat extends Animal{
	String color;
	public Cat() {
//		super();
		this("红色");
//		super(20);
		System.out.println("Cat 的构造方法");
		
	}
	public Cat(String color) {
//		super();
		System.out.println("Cat 有参的构造方法"+color);
		this.color=color;
		
	}
	public Cat(String color,int age,int sex) {
		super(age,sex);
		this.color=color;
//		super.age=age;
//		super.sex=sex;
//		this.age=age;
//		this.sex=sex;
	}
	
	@Override
	public String toString() {
		return "Cat [color=" + color + ", age=" + super.age + ", sex=" + sex + "]";
	}
	public static void main(String[] args) {
//		Cat c=new Cat();
//		如果我想在子类实例化的同时完成属性的赋值，包括子类用到的父类的属性--使用有参的构造方法
		Cat c=new Cat("红色",10,2);
		System.out.println(c);
		
//		Cat c1=new Cat();
//		System.out.println(c1);
		
	}

}
