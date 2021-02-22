package com.nesoft.javase.多线程的创建;
/**
 * 多线程的特点：
 * 		只要在就绪队列中的线程就有获得cpu时间片的机会，线程一旦抢到cpu时间片就跑起来执行run方法
 * 		线程是交替执行的
 * @author Administrator
 *
 */
public class Test {
	/**
	 * main线程(主线程)：优先级比较高
	 * @param args
	 */
	public static void main(String[] args) {
		TestTheadOne t1=new TestTheadOne();
		//让线程进入就绪队列，可以抢cpu时间片(让该线程有获得cpu时间片的机会)
		t1.start();
		TestTheadTwo t2=new TestTheadTwo();
		//让线程进入就绪队列，可以抢cpu时间片(让该线程有获得cpu时间片的机会)
		t2.start();
		for(int i=0;i<100;i++) {
//			Thread.currentThread().getName()获取当前线程的名字
			System.out.println(Thread.currentThread().getName()+"播放音乐");
		}
		
	}

}
