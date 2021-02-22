package com.nesoft.javase.线程通信;
/**
 * 消费线程
 * @author Administrator
 *
 */
public class BuyThread implements Runnable{
	private Bread bread;
	public BuyThread(Bread bread) {
		this.bread=bread;
	}

	@Override
	public void run() {
//		调用消费方法
		for(int i=0;i<10;i++) {//消费10次
			bread.buy();
		}
		
	}

}
