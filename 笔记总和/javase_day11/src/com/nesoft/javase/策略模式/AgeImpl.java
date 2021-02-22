package com.nesoft.javase.策略模式;

public class AgeImpl<E> implements IBase<E>{

	@Override
	public boolean judge(E e) {
		if(18<(Integer)e) {
			return true;
		}
		return false;
	}

}
