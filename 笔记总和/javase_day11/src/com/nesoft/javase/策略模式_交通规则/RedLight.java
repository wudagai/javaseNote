package com.nesoft.javase.策略模式_交通规则;

public class RedLight implements IStrategy{

	@Override
	public void getLight() {
		System.out.println("红灯停");
		
	}

}
