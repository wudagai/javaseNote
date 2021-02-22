package com.nesoft.javase.Interface;
/**
 * IBase 拥有了Animal,Plane接口中的所有抽象方法
 * @author Administrator
 *
 */
public interface IBase extends Animal,Plane{

	@Override
	default void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
