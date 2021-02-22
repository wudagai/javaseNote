package com.nesoft.javase.lambda;
/**
 * 函数式接口：只能有一个抽象方法
 * @author Administrator
 *
 */
@FunctionalInterface
public interface Animal {
//	public void getName(int i);
	
//	public void getAge(int i,String x);
	
//	public void  getAge();
	
	public String getName(int no);
}
