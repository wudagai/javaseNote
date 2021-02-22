package com.nesoft.javase.practice;

public class Company {
	
	public static void getResult(ColaEmployee e) {
//		怎么知道是什么样的员工
		if(e instanceof SalariedEmployee) {
			System.out.println("计算固定工资员工的工资");
//			向下塑型
			SalariedEmployee se=(SalariedEmployee)e;
			System.out.println(se.getName()+"的工资是："+(se.getMonthSal()+se.getSalary(7)));
		}else if(e instanceof SalesEmployee) {
			System.out.println("计算销售员工的工资");
			SalesEmployee se=(SalesEmployee)e;
//			销售工资
			double sal=se.getMonthSales()*se.getRate()+se.getSalary(7);
			System.out.println(se.getName()+"的工资是："+sal);
		}else {
			System.out.println("计算小时工的工资");
			HourlyEmployee se=(HourlyEmployee)e;
//			小时工工资
			double sal=0;
			if(se.getHour()<=160) {
				sal=se.getHour()*se.getHourSal();
			}else {
				sal=(se.getHour()-160)*1.5*se.getHourSal()+160*se.getHourSal();
			}
			System.out.println(se.getName()+"的工资是："+sal);
		}
		
	}

}
