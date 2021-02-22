package com.nesoft.javase.method;
/**
 * 方法的调用
 * @author Administrator
 *	注意：
 *		①方法中的语句块一定是被调用之后才能生效
 *		②同一个方法可以被多次调用
 *什么时候声明无返回值的方法？什么时候声明成有返回值的方法？
 * 当你执行执行方法中的代码块或者该方法只执行某些代码片段不需要得到一个结果时可以声明成无返回值的方法
 * 如果想调用方法后得到结果再对该结果进行下一步操作时可以声明成有返回值的方法
 */
public class MethodCall {
	/**
	 * 无参无返回值方法的调用 
	 * 不需要传入参数也没有返回值
	 */
	public static void getName() {
		System.out.println("无参无返回值");
	}
	/**
	 * 调用有参的方法
	 * 注意：
	 * 	①实参和形参的数量、类型、顺序必须匹配
	 * 	②实参直接在括号中，不需要类型声明,实参可以是变量也可以是常量
	 * @param age
	 */
	public static void getAddress(int age) {
		age+=20;
		System.out.println("有参无返回值"+age);
	}
	public static void getSex(int age,String name) {
		
		System.out.println("有参无返回值"+age+":"+name);
	}
	/**
	 *  有参有返回值方法调用
	 * @param args
	 * 
	 *  注意:如果方法有返回值，调用方法可以得到该方法的返回值，然后赋值给与方法返回值类型相同的变量
	 */
	public static String getEname(int enmpno) {
		System.out.println("根据雇员编号查询雇员姓名");
		String name="scott";
		return name;
	}
	public static double getSal(int enmpno,String name) {
		
//		String name="scott";//在同一个作用域中变量不能重复定义
		return 90.0;
	}

	public static void main(String[] args) {
		System.out.println("方法的调用");
		getName();
//		getName();
		getAddress(1);//1 是实参
		int age=30;
		getAddress(age);// age是实参
		int a=20;
		getAddress(a); //a是实参
		
//		getAddress(a,"zhangsan"); 数量必须匹配
//		getAddress("zhangsan");   类型必须匹配
		
		getSex(20,"zhangsan");
//		getSex("zhangsan",20); 类型必须匹配
		
		String ename=getEname(7788);
		System.out.println("ename:"+ename);
		System.out.println(getEname(1));
		
		double sal=getSal(89, "lisi");
		System.out.println(sal);
		if(20<sal) {
			System.out.println("高收入人群");
		}
		
	}

}
