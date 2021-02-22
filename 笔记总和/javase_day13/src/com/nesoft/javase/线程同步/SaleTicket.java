package com.nesoft.javase.线程同步;
/**
 * 售票线程
 * @author Administrator
 *
 */
public class SaleTicket implements Runnable{
	private Ticket ticket;
//	依赖线程对象，不同的线程对象操作同一个ticket对象
	public SaleTicket(Ticket ticket){
		this.ticket=ticket;
	}
	@Override
	public void run() {
		ticket.saleTicket();
	}
	
}
