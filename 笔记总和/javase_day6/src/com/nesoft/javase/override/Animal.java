package com.nesoft.javase.override;
/**
 * 方法的重载：
 * 		前提：必须在同一个类中
 * 		规则：一同一不同
 * 			方法名相同参数列表不同
 * 			返回值可同可不同
 * 
 * 方法的重写(方法的重载)：是对从父类中继承来的方法进行改造，只有在子类继承父类时发生。
 * 前提：必须有继承或者实现
 * 规则：
 * 	 重写的方法名要和被重写的方法名相同
 * 	 参数列表相同
 * 	 返回值类型相同
 * 	子类覆盖方法的访问权限要不小于父类中被覆盖方法的访问权限
 * 
 *注意： 	 
 *	①当子类中的方法名和参数列表与父类中的方法一致时，编译器就认为该方法为重写的方法
 * 	②子类引用调用重写的方法时执行的是子类重写父类的方法
 *  ③可以使用@Override注解修饰重写的方法，告诉编译器该方法是重写的方法
 * 	④final、static、private 修饰的方法不能被重写
 * 	
 * @author Administrator
 *作用：
 *	①体现行为的多态性：同一个方法有不同的实现
 *	②提高代码的复用率
 *	③使代码结构变得清晰
 *	④子类增强父类中方法的功能
 *	
 */
public class Animal {
	
	public void eat() {
		System.out.println("Animal 动物吃");
	}
	
	public String sleep() {
		System.out.println("Animal 动物睡觉");
		return "Animal 睡得香";
	}
	public String sleep(String name) {
		System.out.println("Animal 动物睡觉");
		return "Animal 睡得香";
	}
	
	protected void play() {
		System.out.println("Animal 玩的开心");
	}
	
//	private void play() {
//		System.out.println("Animal 玩的开心");	
//	}
	

}
