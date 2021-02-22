package com.nesoft.javase.practice;
/**
 *  矩阵类
 * @author Administrator
 *
 */
public class Rectangle {
	double length;
	double width;
	
	public Rectangle(int width,int length) {
		this.length=length;
		this.width=width;
	}
	public double getArea() {
		return length*width;
	}
	
	public double gerPer() {
		return (length+width)*2;
	}
	public void showAll() {
		System.out.println("长："+length+" 宽："+width+" 面积："+getArea()+" 周长："+gerPer());
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(2, 3);
		r1.showAll();
	}
	

}
