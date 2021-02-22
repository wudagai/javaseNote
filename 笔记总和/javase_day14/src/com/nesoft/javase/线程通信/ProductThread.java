package com.nesoft.javase.线程通信;
/**
 * 生产线程
 * @author Administrator
 *
 */
public class ProductThread implements Runnable{
	private Bread bread;
	public ProductThread(Bread bread) {
		this.bread=bread;
	}

	@Override
	public void run() {
//		调用生产方法
		for(int i=0;i<10;i++) { //生产10次
			bread.product();
		}
	}

}
