package com.nesoft.javase.策略模式_交通规则;

public class YellowLight implements IStrategy{

	@Override
	public void getLight() {
		System.out.println("黄灯要注意");
		
	}

}
