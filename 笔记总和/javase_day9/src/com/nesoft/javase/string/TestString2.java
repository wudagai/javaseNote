package com.nesoft.javase.string;


public class TestString2 {
	public static void main(String[] args)  {
		StringBuffer sb=new StringBuffer("zhangsan");//只创建了一个对象
		String s1=new String("zhangsan");//创建了两个的对象
		System.out.println("s1==sb:"+(s1==sb.toString()));//s1==sb:false
		
		String s2="he";
		String s3="llo";
//		字符串常量相加时在子串常量池中创建对象
		String s4="he"+"llo";
		String s5="hello";
		String s6=new String("hello");
//		字符串常量和字符串引用或者字符串引用与引用之间相加是会StringBuffer对象保存字符串字面量
		String s7=s2+s3;
		String s8=s2+"llo";
		System.out.println("s4："+s4);//hello
		System.out.println("s5："+s5);
		System.out.println("s6："+s6);
		System.out.println("s6："+s6);
		System.out.println("s7："+s7);
		System.out.println("s8："+s8);//hello
		
		System.out.println("s4==s5:"+(s4==s5));//s4==s5:true
		System.out.println("s4==s6:"+(s4==s6));//s4==s5:false
		System.out.println("s5==s7:"+(s5==s7));//s5==s7:false
		System.out.println("s5==s8:"+(s5==s8));//s5==s8:false
		System.out.println("s7==s8:"+(s7==s8));//s7==s8:false
		System.out.println("s5==s8:"+(s5==s8));//s5==s8:false

	}

}
