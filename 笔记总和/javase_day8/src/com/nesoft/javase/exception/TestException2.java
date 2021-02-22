package com.nesoft.javase.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException2 {
	/**
	 *  try{}catch(){}
	 *  ①是用来捕获并处理try块抛出的异常的代码块。没有try块，catch块不能单独存在
	 *  ②可以有多个catch块，以捕获不同类型的异常
	 * 
	 *执行过程：每次try块有异常抛出，系统会试着从上到下往每个catch块中传参，直到遇到一个类型匹配的catch块为止
	 *	 
	 *
	 * 注意：
	 * 	①如果有多个catch只会匹配第一个出现异常的catch语句块,后面的catch不再执行
	 * 	②如果try语句块中的代码出现了异常那么执行相对应的catch语句块，try语句块中出行异常的下一行代码不再执行
	 * 	③catch块中的形参为Exception类型需要放到最后，也可以只用一个catch语句块但他的类型为Excpetion(不建议)，出现什么异常就处理什么异常类型
	 * 	④catch中类型声明的顺序：如果抛出的异常有父子关系时先catch子类异常再catch父类异常
	 * 	⑤try语句块中只放会出现异常的代码，不要添加其他任何代码，因为会占用内存资源
	 */
	public static void getCheckException(){
		File file=new File("D:/x.txt");
		try {
			
			FileInputStream in=new FileInputStream(file);
			System.out.println("zhangsan-------------------");
			Class.forName("student");//将类加载进内存
			
		}/*catch(ClassNotFoundException e){
//			System.out.println("类找不到哦");
			e.printStackTrace();//打印堆栈异常信息  包括错误的信息和错误代码在第几行
		} catch (FileNotFoundException e) {
//			System.out.println("文件找不到哦");
			e.printStackTrace();
		}*/catch(Exception e) {
//			System.out.println("异常");
			e.printStackTrace();
		}
	}
//	jdk1.7之后的新特性  这种用法是不包括异常的子类型的
	public static void getResult() {
		File file=new File("D:/x.txt");
			try {
				file.createNewFile();
				FileInputStream in=new FileInputStream(file);
				Class.forName("student");
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
//	finally语句块
	/**
	 * 
	 * finally:最终执行--在try catch执行完之后无论如何都会执行的语句块
	 * 		语法： try{}finally{}    try{} catch(){}fianlly{}
	 * 
	 * 作用：一般用于释放资源
	 * @param args
	 */
	public static void testFinally() {
		File file=new File("D:/x.txt");
		try {
			FileInputStream in=new FileInputStream(file);
			System.out.println("try语句块----------------");
			Class.forName("student");
			System.out.println("student---------------");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("catch语句块文件找不到");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("catch语句块类找不到哦");
		}finally {
			System.out.println("这是finlly语句块-------------");
		}
	}
	public  static void testFinally2() {
		try {
			System.out.println("try");
		}finally {
			System.out.println("finally");
		}
	}
	
	public static void testFinally3() {
		int i=10;
		try {
			i++;
			Class.forName("student");
		} catch (Exception e) {
			i++;
			e.printStackTrace();
		}finally {
			System.out.println("fianlly"+i);
		}
		System.out.println("try-catch之后的代码");
	}
	public static int testFinally4() {
		int i=10;
		try {
			i++;
			
			Class.forName("student");
			 /*
			  * 如果try中有return语句,执行到return后先将返回值保存到return中，然后再看有没有finally语句块
			  * 有，有finally语句块如果fianlly中没有return那么执行finally语句块然后再执行try中的return
			  * 
			  *  如果fianlly中有return那么执行finaly中的return语句，之前的try中的return失效
			  */
			return i;
		} catch (Exception e) {
			i++;
			return i;
//			e.printStackTrace();
		}finally {
			i++;
			System.out.println("fianlly"+i);
			return i;
		}
//		System.out.println("try-catch之后的代码");
//		return i;
	}
	
	public static void main(String[] args) {
//		getCheckException();
//		testFinally();
//		testFinally2();
		System.out.println(testFinally4());
	}

}
