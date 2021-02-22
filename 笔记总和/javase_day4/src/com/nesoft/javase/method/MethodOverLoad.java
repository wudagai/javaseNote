package com.nesoft.javase.method;
/**
 * 方法重载：
 * 	前提：在同一个类中
 * 	规则：
 * 		一同一不同
 * 		方法名相同，参数列表不同
 * 		①方法名必须相同
 * 		②参数的类型不同或者参数的个数不同
 * 		③返回值可同可不同
 * 
 * @author Administrator
 *
 */
public class MethodOverLoad {
	
	public  void getName() {
		System.out.println("getName()");
	}
	
	public  void getName(int age) {
		System.out.println("getName(int age)"+age);
	}
	
	public  void getName(String name) {
		System.out.println("getName(int age)"+name);
	}
	
	public  void getName(String name,int age) {
		System.out.println("getName(int age)"+name+":"+age);
	}
	
	public  String getName(int age,String name) {
		System.out.println("getName(int age)"+name+":"+age);
		return name;
	}
	
	public static void main(String[] args) {
//		实例化之后才能调用成员方法
		MethodOverLoad ol=new MethodOverLoad();
		ol.getName();
		ol.getName(10);
		ol.getName("zhangsan");

	}

}
