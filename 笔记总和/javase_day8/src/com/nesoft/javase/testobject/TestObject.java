package com.nesoft.javase.testobject;
/**
 * Object中的方法
 * @author Administrator
 *
 */
public class TestObject {
//	equals方法  一般子类会重写Object类中的equals方法实现不同的功能
	public static void testObjectEquals() {
//		equals(Object o) 在Object中用来判断两个对象内存地址是否相同
		Object o1=new Object();
		Object o2=new Object();
//		== 用于基本数据类型时判断两个值是否相同
//		== 用于引用数据类型时判断两个对象的内存地址是否相同
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("o1==o2:"+(o1==o2));//o1==o2:false
		System.out.println(o1.equals(o2));//false
		
		Student s1=new Student();
		s1.age=10;
		Student s2=new Student();
		s2.age=10;
		System.out.println(s1.equals(s2));
	}
//	String 类中的equals方法
	public static void testStringEquals() {
		String s1=new String("zhangsan");
		String s2=new String("zhangsan");
		System.out.println(s1+","+s2);
		System.out.println(s1==s2);//false
		
//		首先判断两个字符串地址是否相同，如果不相同，判断内容是否相同，如果内容相同返回true否者false;
//		总结：要判断两个字符串内容是否相同使用equals即可
		System.out.println(s1.equals(s2));//true
		
//		equals和==的区别：
//		== 用于基本数据类型时判断两个值是否相同，用于引用数据类型时判断两个对象的内存地址是否相同
//		equals方法在Object中是判断两个对象的内存地址是否相同,子类重写equals方法之后实现的是子类中重写了equals方法的功能
//		比如 String类中的equals用来判断两个字符串内容是否相同 的。
		
	}
	
//	HashCode:返回十六进制对象内存地址(对象的hash码)，通过hash算法将对象的地址转为十六进制数之后返回
	public static void testObjectHashCode() {
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1);//@7852e922
		System.out.println(o2);//@4e25154f
		System.out.println(o1.hashCode());//2018699554
		System.out.println(o2.hashCode());//1311053135
	}
//	toString：返回对象的内存地址
	public static void testObjectToString(){
		Object o1=new Object();
		System.out.println(o1.toString());//@7852e922
//		新建的类一般重写toString方法：输出对象的具体内容
		Student s=new Student();
		System.out.println(s.toString());//Student [age=0]
		
	}
	
	public static void main(String[] args) {
//		testObjectEquals();
//		testStringEquals();
//		testObjectHashCode();
		testObjectToString();
		
	}

}
