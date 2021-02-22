package com.nesoft.javase.practice;

public class TestCompany {

	public static void main(String[] args) {
		SalariedEmployee emp0=new SalariedEmployee(10000, "lisi", 7);
		SalesEmployee emp1=new SalesEmployee(2000000, 0.1, "zhangsan", 6);
		HourlyEmployee emp2=new HourlyEmployee(40, 240, "wangwu", 5);
		
		ColaEmployee[] emps= {emp0,emp1,emp2};
		for(ColaEmployee e:emps) {
			Company.getResult(e);
		}

	}

}
