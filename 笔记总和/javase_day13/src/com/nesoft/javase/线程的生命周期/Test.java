package com.nesoft.javase.线程的生命周期;

public class Test {
	public static void main(String[] args) {
		TestTheadOne t1=new TestTheadOne();//新建状态
		t1.start();//让线程就绪状态，就绪状态的线程处于就绪队列中
		
//		判断线程是否还活着
		System.out.println(t1.isAlive());
	}

}
