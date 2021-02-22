package com.nesoft.javase.polymorphism;
/**
 * 彩色打印机
 * @author Administrator
 *
 */
public class ColorPrint extends Print{

	@Override
	public void println() {
		System.out.println("彩色打印机打印彩色");
	}
	
}
