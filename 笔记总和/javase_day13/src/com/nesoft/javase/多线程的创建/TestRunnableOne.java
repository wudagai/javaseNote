package com.nesoft.javase.多线程的创建;
/**
 * 线程对象
 * @author Administrator
 *
 */
public class TestRunnableOne implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"人物移动");
		}
		
	}

}
