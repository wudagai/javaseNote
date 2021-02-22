package com.nesoft.javase.practice;

public class ColaEmployee {
	String name;
	int month;
	public ColaEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ColaEmployee(String name, int month) {
		super();
		this.name = name;
		this.month = month;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * this.month:员工的生日
	 * @param month :当前月份
	 * @return
	 */
	public int  getSalary(int month) {
		if(this.month==month) {
			return 100;
		}else {
			return 0;
		}
		
		
	}

}
