package com.nesoft.javase.线程通信;
/**
 * 测试方法
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Bread b=new Bread();
//		生产面包线程
		ProductThread p1=new ProductThread(b);
		new Thread(p1).start();
		ProductThread p2=new ProductThread(b);
		new Thread(p2).start();
//		消费面包线程
//		BuyThread b1=new BuyThread(b);
//		new Thread(b1).start();
//		BuyThread b2=new BuyThread(b);
//		new Thread(b2).start();
	}

}
