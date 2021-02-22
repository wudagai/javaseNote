package com.nesoft.javase.getfit;
/**
 * 向上塑型： 父类引用(对象)指向子类实例	
 * 前提 — 具有继承或实现关系
 * 		 ①引用.重写的方法执行的是子类重写父类的方法
 * 		 ②向上转换损失了子类新扩展的属性和方法，仅可以使用从父类中继承的属性和方法
 * 	     ③子类转换为父类，自动转换
 * 向下塑型：必须先向上塑型才能向下塑型
 * 		如果想用子类自有的属性和方法那么需要向下塑型
 * 		强制转换
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {

		Dog d=new Dog();
		d.eat();
		d.dealer();
		System.out.println("d instanceof Animal:"+(d instanceof Animal));//true
		Biological b=new Crow();
		b.breathing();
		System.out.println("b instanceof Biological:"+(b instanceof Biological));//true

		
//		向上塑型： 父类引用(对象)指向子类实例	
		Animal dog1=new Dog(); //狗是动物
		dog1.eat();
		System.out.println("dog1 instanceof Animal:"+(dog1 instanceof Animal));//true
		System.out.println("dog1 instanceof Dog:"+(dog1 instanceof Dog));//true

//		向下塑型：必须先向上塑型才能向下塑型
		Animal a=new Animal();
		System.out.println("a instanceof Cat:"+(a instanceof Cat));//false
//		Cat cat1=(Cat) a;//编译通过 Animal cannot be cast to Cat
		Animal cat=new Cat();
		cat.getAge();//父类没有被重写的方法  Animal getAge
		cat.eat();//执行子类重写父类的方法 Cat eat
		

//		如果想用子类自有的属性和方法那么需要向下塑型
		Cat cat1=(Cat) cat;
		cat1.catchmice();//自有的方法恢复 Cat 抓老鼠
		System.out.println("cat1 instanceof Animal:"+(cat1 instanceof Animal));//true
//		Dog dog2=(Dog) cat;//编译通过 Cat cannot be cast to Dog
		
		System.out.println("cat instanceof Dog:"+(cat instanceof Dog));//false
	}

}
