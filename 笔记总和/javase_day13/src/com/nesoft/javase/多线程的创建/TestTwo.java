package com.nesoft.javase.多线程的创建;

public class TestTwo {
	public static void main(String[] args) {
//		实例化线程对象
		TestRunnableOne one=new TestRunnableOne();
//		one.run();//这样调用run方法并不是创建线程,而是调用一个成员方法而已
		Thread t1=new Thread(one);
		t1.start();
		TestRunnableTwo two=new TestRunnableTwo();
//		two.run();
		Thread t2=new Thread(two);
		t2.start();
	}
	

}
