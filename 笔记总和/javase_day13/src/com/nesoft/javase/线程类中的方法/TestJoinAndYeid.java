package com.nesoft.javase.线程类中的方法;
/**
 * join()：该方法只会让主线程进入阻塞状态
 * 
 *    我们把调用join的线程称为副线程,让主线程进入阻塞状态等待副线程执行完后主线程阻塞才接除
 * 注意：必须调用start方法后再调用join()方法，join()方法才生效
 * @author Administrator
 *
 */
public class TestJoinAndYeid {
	public static void main(String[] args) throws InterruptedException  {
		
		TestTheadOne t1=new TestTheadOne();
		t1.start();
//		t1.yield();//让出cpu，进入就绪队列，使线程优先级比较高的线程获得cpu时间片
//		t1.join();//会让main进入阻塞状态，等待t1执行完main才解除阻塞
		TestTheadTwo t2=new TestTheadTwo();
		t2.start();
		
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"发送弹幕main"+i);
		}
		
		
	}

}
