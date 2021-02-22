package com.nesoft.javase.包装类;
/**
 * 包装类
 * @author Administrator
 *
 */
public class TestInteger {

	public static void main(String[] args) {
/*		数据类型	包装类
		boolean	Boolean
		byte	Byte
		char	Character
		double	Double
		float	Float
		int	 Integer
		long	Long
		short	Short*/
		
//		包装类的作用：用来实现基本数据类型与引用数据(String)类型的转换
		
//		int--Integer
		int i1=129;
//		方式一：通过构造器
		Integer ig1=new Integer(i1);
		System.out.println(ig1);//1
//		方式二：valueOf
		ig1=Integer.valueOf(128);
		Double.valueOf(20.9);
		System.out.println(ig1);//128
//		方式三：jdk1.5之后，自动装箱--隐式转换
		Integer ig2=20;
		System.out.println(ig2);//20
		ig2=129;
		System.out.println(ig2);//129
		
		
//		面试题：
		Integer ig3=new Integer(129);
		Integer ig4=new Integer(129);
		System.out.println(ig3==ig4);//false
		System.out.println(ig3.equals(ig4));//true
//		100存放于整型常量池中
		Integer ig5=100;
		Integer ig6=100;
		System.out.println(ig5==ig6);//true
//		整型常量池范围：-128~127
		ig5=128;
		ig6=128;
//		如果存数不在-128~127 ,就会默认调用valueOf方法，而valueOf会在堆内存新建对象存储数据
		System.out.println(ig5==ig6);//false
		System.out.println(Integer.valueOf(123)==Integer.valueOf(123));//true
		System.out.println(Integer.valueOf(128)==Integer.valueOf(128));//false

//		Integer --int
		Integer ig7=new Integer(10);
		int i7=ig7.intValue(); //intValue() 不是静态方法
		System.out.println(i7);//10
//		Double-- double
		Double d1=new Double(20.7);
		double d=d1.doubleValue();
		
//		自动拆箱 
		i7=ig7;
		int i8=new Integer(233);
		
		
//		Integer--String 
		String s7=ig7.toString();
		System.out.println(s7);
		
//		String -- Integer
//		方式一：构造方法
		Integer ig8=new Integer("9000");
		System.out.println(ig8);
//		方法二：valueOf(String s)
		Integer.valueOf("124");
		
//		int--String 
		Integer ig10=i7;
		String ss=ig10.toString();
		
//		String--int
		int i9=Integer.parseInt("7788");
		System.out.println(i9);

	}

}
