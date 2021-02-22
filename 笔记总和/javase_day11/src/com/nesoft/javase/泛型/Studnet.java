package com.nesoft.javase.泛型;

import java.util.ArrayList;

public class Studnet<E> {
	
	public static void getName(int i) {
		System.out.println(i);
	};
	
	public static void getName(Object o) {
		System.out.println(o);
	};
	
	public static Integer getName(Integer o) {
		System.out.println(o);
		return o;
	};
	public static Object getSex() {
		return null;
		
	}
	
	public void add(E o) {
		System.out.println(o);
	}
	
	public E get() {
		return (E) "zhangsan";
		
	}
	
	
	
	public static void main(String[] args) {
		getName(2);
		
		ArrayList<String> a=new ArrayList<>();
		a.add("zhangsan");
		Studnet s=new Studnet();
		s.add("zhangsan");
		String ss=(String) s.get();
		
		Studnet<String> s1=new Studnet();
		s1.add("zhangsan");
		s1.get();
	}

}
