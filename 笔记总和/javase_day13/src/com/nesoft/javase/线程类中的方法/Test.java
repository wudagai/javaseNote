package com.nesoft.javase.线程类中的方法;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		TestTheadOne t1=new TestTheadOne();
		t1.start();
		Thread.sleep(1000);
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"播放音乐11"+i);
		}
//		t1.setPriority(10);
//		注意：通过setPriority()设置线程的优先级只是让线程获得时间片的概率改变而已并不是绝对的得到cpu时间片
//		t1.setPriority(Thread.MAX_PRIORITY);//如果优先级比较高只是获得cpu时间片的概率大一点而已
//		设置和获取线程的优先级:新建的线程优先级都为5   getPriority()的数值越大优先级越高
//		System.out.println(t1.getPriority());//10
		TestTheadTwo t2=new TestTheadTwo();
		t2.start();
//		System.out.println(t2.getPriority());//5 
		
//		判断线程是否还活着
//		System.out.println(t1.isAlive());
//		sleep(mills) 指定线程睡眠时间，会使线程进入阻塞状态，不会释放锁资源
	}

}
