package com.nesoft.javase.superAndThis;
/**
 * this和this()
 * 	this:当前实例化对象
 * 	this([参数]):当前类的构造器
 * 		①当this([参数])中不带参数时调用的是无参构造方法，根据参数判断调用的构造方法
 * 		②this([参数])只能在构造器中被调用
 * 		③对象的初始化只需要让一个构造器完成，所以一个构造方法中只能调用一个this([参数])
 * 		④this([参数])在被调用时一定在构造器第一行
 * 
 * @author Administrator
 *
 */
public class Animal {
	int age;
	int sex;
	public Animal() {
//		this(20);
//		this(20,2);
		System.out.println("Animal 无参构造方法");
		
	}
	public Animal(int age) {
		System.out.println("Animal 有参构造方法"+"age:"+age);
		this.age=age;
	}
	public Animal(int age,int sex) {
		System.out.println("Animal 有参构造方法"+"age:"+age+" sex:"+sex);
		this.age=age;
		this.sex=sex;
	}
//	成员方法
	public void getAge() {
//		this();编译不通过
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", sex=" + sex + "]";
	}
	public static void main(String[] args) {
//		Animal a1=new Animal();
//		System.out.println(a1);
		
//		Animal a2=new Animal(20);
//		System.out.println(a2);

		
	}
	

}
