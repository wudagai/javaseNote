package com.nesoft.javase.singleInstance;
/**
 * 	private:修饰的变量和方法只能在本类中使用
 * 	 public：修饰变量和方法能在所有类中使用
 *  单例模式：
 *  	规则：
 *  		①提供一个私有的构造器
 *  		②声明一个私有的、静态的、自身变量
 *  		③提供一个全局访问点
 * 
 * 注意：单例模式的类建议不要有成员变量，不然会出现并发操作数据不一致问题
 * 使用场景：当类中都是行为时可以将该类变成单例模式或者该类中的成员变量不发生修改时
 * 、	
 * @author Administrator
 *
 */
public class Animal {
//	int age;
//	私有构造器
	private Animal() {
		System.out.println("构造方法");
	}
//	声明一个私有的、静态的、自身属性
	private static Animal animal=new Animal();
//	提供一个全局访问点：static修饰，返回值为当前类的类型  懒汉式
//	public static Animal getAnimalInstacne() {
//		if(animal==null) {
//			animal=new Animal();
//		}
//		return animal;
//	}
//	饿汉式
	public static Animal getAnimalInstacne() {
		return animal;
		
	}
}
