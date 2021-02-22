package com.nesoft.javase.practice;

public class Vehicle {
	String brand;
	String color;
	double speed;
	public Vehicle() {
		
	}
	public Vehicle(String brand, String color, double speed) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setBrand(String brand) {
//		如果品牌为null  可以修改
		if(this.brand==null) {
			this.brand = brand;
		}else {
			System.out.println("不能修改已经初始化的品牌");
		}
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void run() {
		System.out.println(color+"的"+brand+"牌汽车使用"+speed+"速度奔跑在马路上");
	}
	public static void main(String[] args) {
		Vehicle benz=new Vehicle("benz", "black", 999);
		benz.run();
	}
	
	

}
