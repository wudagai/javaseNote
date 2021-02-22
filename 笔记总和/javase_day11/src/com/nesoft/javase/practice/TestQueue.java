package com.nesoft.javase.practice;

import java.util.LinkedList;

public class TestQueue {
//	TestQueue依赖LinkedList
	private LinkedList ld; 
//	为了在TestQueue操作同一个LinkedList对象
	public TestQueue(LinkedList ld) {
		this.ld=ld;
	}
	
//	放值进队列的方法
	public  void put(Object o) {
		ld.add(o);
		
	}
//	从队列取值的方法
	public  Object get() {
		if(isEmpty()) {
			return "队列为空";
		}
		return ld.removeFirst();
		
	}
	
// 判断队列是否为空
	public boolean isEmpty() {
		if(ld.isEmpty()) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		LinkedList l1=new LinkedList<>();
		TestQueue q1=new TestQueue(l1);
		q1.put("zhangsan");
		q1.put("lisi");
		q1.put("wangwu");
		
		System.out.println(q1.get());
		System.out.println(q1.get());
		System.out.println(q1.get());
		System.out.println(q1.get());
		
		TestQueue q2=new TestQueue(l1);
		
		

	}

}
