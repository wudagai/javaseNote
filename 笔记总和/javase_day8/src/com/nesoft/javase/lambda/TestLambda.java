package com.nesoft.javase.lambda;

public class TestLambda {

	public static void main(String[] args) {

//		匿名内部类
/*		Animal a=new Animal() {
			@Override
			public void getName(int s) {
				System.out.println("匿名内部类"+s);
				
			}
		};
		a.getName(20);*/
//		Lambda表达式：允许我们将接口中的行为传到函数里
		/*
		 * 语法：
		 * 	([参数])->{代码块}
		 *  一个括号内用逗号分隔的形式参数，参数是函数式接口里面方法的参数 
		 *  一个箭头符号：-> 
		 *  方法体，可以是表达式和代码块。
		 *  接口只包含一个方法可以使用@FunctionalInterface注解
		 */
//		public void getName(int i); 单参无返回值
		/*Animal aa=(s)->{
			System.out.println("Lambda表达式"+s);
			
		};
		
		aa.getName(10);*/
//		public void getAge(int i,String x); 多参无返回值
		/*Animal aa=(i,x)->{
			System.out.println("Lambda表达式"+i+","+x);
		};
		aa.getAge(20, "zhangsan");*/
		
//		public void  getAge();  无参无返回值
		/*Animal aa=()->{
			System.out.println("Lambda表达式");
		};
		aa.getAge();*/
		
//		public String getName(int no);
		Animal aa=(s)->{
			System.out.println("Lambda表达式"+s);
			return "zhangssan";
			
		};
		String name=aa.getName(20);
		System.out.println(name);
	}

}
