package com.nesoft.javase.polymorphism;
/**
 * 黑白打印机
 * @author Administrator
 *
 */
public class BWPrint extends Print{

	@Override
	public void println() {
		System.out.println("黑白打印机打印黑白的");
	}
	
}
