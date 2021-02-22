package com.nesoft.javase.Interface;

public class Eagle extends Biological implements Animal,Plane{

	@Override
	public void fly() {
		System.out.println("Eagle 一直飞");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sleep(int mills) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathing() {
		System.out.println("老鹰 能呼吸");
		
	}
	

}
