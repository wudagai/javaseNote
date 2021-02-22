package com.nesoft.javase.策略模式_交通规则;
/**
 * 公共访问类
 * @author Administrator
 *
 */
public class PublicStrategy {
//	接收不同的策略者对象
	private IStrategy istrategy;
	
	public PublicStrategy(IStrategy istrategy) {
		this.istrategy=istrategy;
	}
//	提供一个公有访问不同策略者具体实现的方法
	
	public void getResult() {
		istrategy.getLight();
	}

}
