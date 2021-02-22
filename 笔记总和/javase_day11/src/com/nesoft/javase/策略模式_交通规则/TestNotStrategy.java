package com.nesoft.javase.策略模式_交通规则;

public class TestNotStrategy {

	public static void main(String[] args) {
		String light="红灯";
		if(light.equals("红灯")) {
			System.out.println("红灯停");
		}else if(light.equals("绿灯")) {
			System.out.println("绿灯行");
		}else if(light.equals("黄灯灯")){
			System.out.println("黄灯,要注意");
		}

	}

}
