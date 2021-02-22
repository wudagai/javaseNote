package com.nesoft.javase.polymorphism;
/**
 * 绿色打印机
 * @author Administrator
 *
 */
public class GreenPrint extends Print{

	@Override
	public void println() {
		System.out.println("彩色打印机打印绿色");
	}
	
}
