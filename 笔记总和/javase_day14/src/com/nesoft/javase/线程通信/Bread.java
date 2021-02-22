package com.nesoft.javase.线程通信;
/**
 * 面包房
 * @author Administrator
 *wait():会使当前线程进入阻塞状态，没有其他线程唤醒它，它就会一直阻塞
 *notify()：唤醒当前等待的一个线程，唤醒谁不清楚
 *notifyAll():唤醒所有等待的线程
 *
 *注意：notify()和notifyAll()以及wait()在synchronized保护的方法或者代码块中才生效否者会抛出异常IllegalMonitorStateException
 *		sleep()和wait()方法的区别：
 *		sleep():不会是释放锁资源,是Thread类的方法
 *		wait():会释放锁资源,是Object中的方法
 *		
 */
public class Bread {
//	一开始规定没有面包
	private boolean flag=false;
	
//	生产方法
	public synchronized void product() {
		/**
		 * 没有面包就生产
		 */
		if(!flag) {
			System.out.println(Thread.currentThread().getName()+"生产了面包");
			flag=true;
			
		}else {
			System.out.println(Thread.currentThread().getName()+"快去消费吧");
			try {
//				notify();//唤醒正在等待的线程
//				如果有了面包那么等待消费
				wait();//这个方法会使当前线程进入阻塞状态，没有其他线程唤醒它，它就会一直阻塞
//				Thread.sleep(10000000);
//				阻塞之后的代码不会执行
				System.out.println("生产阻塞解除");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
//	消费方法
	public synchronized void buy() {
		/**
		 * 有面包就消费
		 */
		if(flag) {
			System.out.println(Thread.currentThread().getName()+"消费了面包");
			flag=false;
			
		}else {
			System.out.println(Thread.currentThread().getName()+"快去生产吧");
			try {
//				notify();//唤醒正在等待的线程
//				如果没有面包那么等待生产
				wait();
				System.out.println("消费阻塞解除");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
