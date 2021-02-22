package com.nesoft.javase.practice;
/**
 * 固定工资的员工
 * @author Administrator
 *
 */
public class SalariedEmployee extends ColaEmployee{
	double monthSal;//月薪
	
	public SalariedEmployee() {
		
	}

	public SalariedEmployee(double monthSal,String name, int month) {
		super(name, month);
		this.monthSal=monthSal;
	}

	public double getMonthSal() {
		return monthSal;
	}

	public void setMonthSal(double monthSal) {
		this.monthSal = monthSal;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [monthSal=" + monthSal + ", name=" + name + ", month=" + month + "]";
	}
	
	
}
