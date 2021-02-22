package com.nesoft.javase.策略模式_交通规则;
/**
 *  不同的类中只存在行为的不同可以使用策略模式
 *  将简单的算法实现封装成一个个类中的方法实现，用一个策略者规定行为即可
 * 
 * @author Administrator
 *
 */
public class TestStrategy {

	public static void main(String[] args) {
		GreenLight green=new GreenLight();
		RedLight red=new RedLight();
		PublicStrategy p=new PublicStrategy(green);
		p.getResult();
		PublicStrategy p1=new PublicStrategy(red);
		p1.getResult();
	}

}
