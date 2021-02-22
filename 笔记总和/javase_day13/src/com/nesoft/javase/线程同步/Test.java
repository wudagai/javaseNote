package com.nesoft.javase.线程同步;

public class Test {
	public static void main(String[] args) {
		Ticket ticket=new Ticket();
//		代售点一：
		SaleTicket t1=new SaleTicket(ticket);
		new Thread(t1).start();
//		代售点二：	
		SaleTicket t2=new SaleTicket(ticket);
		new Thread(t2).start();
//		代售点三：	
//		SaleTicket t3=new SaleTicket(ticket);
//		new Thread(t3).start();
	}

}
