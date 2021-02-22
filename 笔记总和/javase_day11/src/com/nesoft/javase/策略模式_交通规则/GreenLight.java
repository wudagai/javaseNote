package com.nesoft.javase.策略模式_交通规则;

public class GreenLight implements IStrategy{

	@Override
	public void getLight() {
		System.out.println("绿灯行");
		
	}

}
