package com.nesoft.javase.多线程的创建;
/**
 * 线程类对象
 * @author Administrator
 *
 */
public class TestTheadOne  extends Thread{
	@Override
	public void run() {//线程跑起来真正干活的是run方法
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"人物移动");
		}
	}
	

}
