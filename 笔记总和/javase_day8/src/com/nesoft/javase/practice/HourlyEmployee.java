package com.nesoft.javase.practice;
/**
 * 小时工
 * @author Administrator
 *
 */
public class HourlyEmployee extends ColaEmployee{
	double hourSal;//每小时工资
	double hour;//每个月工作小时数
	public HourlyEmployee() {
		super();
	
	}
	public HourlyEmployee(double hourSal,double hour,String name, int month) {
		super(name, month);
		this.hourSal=hourSal;
		this.hour=hour;
		
	}
	public double getHourSal() {
		return hourSal;
	}
	public void setHourSal(double hourSal) {
		this.hourSal = hourSal;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [hourSal=" + hourSal + ", hour=" + hour + ", name=" + name + ", month=" + month + "]";
	}
	
	
	
}
