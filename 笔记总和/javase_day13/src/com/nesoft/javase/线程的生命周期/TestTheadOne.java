package com.nesoft.javase.线程的生命周期;
/**
 * 线程类对象
 * @author Administrator
 *
 */
public class TestTheadOne  extends Thread{
	@Override
	public void run() {//线程跑起来真正干活的是run方法，run方法执行完进入死亡状态
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"人物移动"+i);
		}
	}
}
