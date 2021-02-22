package com.nesoft.javase.线程同步;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *   铁路局老大
 * @author Administrator
 *
 */
public class Ticket {
//	一开始规定只有100张票  1~100号
	int ticketNo=100;
//	一把真正的锁
	private Lock lock=new ReentrantLock();
	
//	当上锁之后，只有获得锁资源的线程才能执行，其他线程需要操作这些锁起来的代码或方法必须等待(阻塞)持有锁资源的线程释放锁资源后才能执行
	
//	售票方法
	/**
	 * synchronized:同步--保证数据同步
	 *   锁方法，粒度较大
	 *   锁方法：在方法上加synchronized关键字
	 *   当方法执行完之后释放锁资源
	 */
//	public synchronized void saleTicket() {
//		System.out.println(Thread.currentThread().getName()+"一万行代码");
//		while(0<ticketNo) {// 0:100  1:100
//			System.out.println(Thread.currentThread().getName()+"卖了"+ticketNo+"号票");
//			ticketNo--;//0:92
//		}
//	}
	/**
	 * 锁对象：锁代码块，将出现并发问题的代码锁起来，粒度小
	 * 当锁的代码块执行完之后才释放锁资源
	 * 	
	 */
//	public  void saleTicket() {
//		System.out.println(Thread.currentThread().getName()+"一万行代码");
//		synchronized(this) {
//		while(0<ticketNo) {// 0:100  1:100
//			System.out.println(Thread.currentThread().getName()+"卖了"+ticketNo+"号票");
//			ticketNo--;//0:92
//		}
//	}
//}
	/**
	 * 锁：jdk面向对象编程提供了一把真正的锁
	 */
	public  void saleTicket() {
	System.out.println(Thread.currentThread().getName()+"一万行代码");
	lock.lock();//上锁
	while(0<ticketNo) {// 0:100  1:100
//		try {
//			Thread.sleep(1000);//不释放锁资源
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread().getName()+"卖了"+ticketNo+"号票");
		ticketNo--;//0:92
	}
	lock.unlock();//解锁

} 

}
