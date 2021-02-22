package com.nesoft.javase.practice;
/**
 * 销售工
 * @author Administrator
 *
 */
public class SalesEmployee extends ColaEmployee{
//	月销售额
	double monthSales;
//	提成率
	double rate;
	
	public SalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SalesEmployee(double monthSales,double rate,String name, int month) {
		super(name, month);
		this.monthSales=monthSales;
		this.rate=rate;
		
	}

	public double getMonthSales() {
		return monthSales;
	}

	public void setMonthSales(double monthSales) {
		this.monthSales = monthSales;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "SalesEmployee [monthSales=" + monthSales + ", rate=" + rate + ", name=" + name + ", month=" + month
				+ "]";
	}
	
	
	
	
}
