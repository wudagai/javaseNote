package com.nesoft.javase.practice;

public class Car extends Vehicle{
	int loader;

	public Car() {
	
	}
	public Car(int loader,String brand, String color, double speed) {
		super(brand, color, speed);
		this.loader=loader;
		
	}
	@Override
	public void run() {
		System.out.println(color+"的"+brand+"牌汽车使用"+speed+"速度奔跑在马路上载人数为"+loader);

	}
	public static void main(String[] args) {
		Car c=new Car(2,"Honda","red",9090);
		c.run();
	}
	
	

}
