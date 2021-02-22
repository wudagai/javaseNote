package com.nesoft.javase.泛型;

import java.util.LinkedList;

public class TestQueue<T>{
	private LinkedList<T> list=new LinkedList<>();
	
	public void put(T t) {
		list.add(t);
	}
	
	public T get() {
		return list.removeFirst();
	}
	
	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<>();
		
	}

}
