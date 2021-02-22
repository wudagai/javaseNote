package com.nesoft.javase.subclassProcess;
/**
 * 子类实例化过程：先初始化化父类再初始化子类，最后完成子类的创建（先调用父类的构造方法再调用子类的构造方法）
 *       父类的静态代码块--子类静态代码块--父类的构造代码块--父类构造器--子类构造代码块--子类构造器
 * @author Administrator
 *
 */
public class Cat extends Animal{
	String color;
	
	{
		System.out.println("Cat 的构造代码块");
	}
	
	static {
		System.out.println("Cat 的静态代码块 ");
	}
	public Cat() {
		System.out.println("Cat 的构造方法");
	}

}
