package com.nesoft.javase.List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * List集合：
 * 		 特点：三有产品     有序有索引有重复值
 * 			①有序有索引,索引从0开始，最大到size-1
 * 			②可以有重复值
 * 			③有null值,而且可以有多个
 * 
 * @author Administrator
 * 	线性表：顺序存储  链式存储
 *	ArrayList:基于数组--不定长、在物理地址上连续的两个元素，逻辑地址也连续 (顺序存储)
 *			 ①访问速度较快
 *			 ②对集合的操作(插入和删除)速度较慢
 *	LinkedList:基于链表--在物理地址上连续的两个元素，逻辑地址不一定连续(链式存储)
 *			①访问速度较慢
 *			②对集合的操作(插入和删除)速度较慢
 *			
 */
public class TestList {
	public static void testList() {
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(14);
		list1.add(9);
		list1.add(79);
		list1.add(79);
		list1.add(null);
		list1.add(null);
		System.out.println("list1:"+list1);//list1:[12, 14, 9, 79, 79, null, null]
		
//		List集合中自有的方法  
//		void add(int index,Object element)	在列表中的index位置，添加element元素
		System.out.println(list1.size());//7
		list1.add(1,99);
		System.out.println("list1:"+list1);//list1:[12, 99, 14, 9, 79, 79, null, null]
		
//		Object get(int index)	返回列表中指定位置的元素 
		System.out.println(list1.get(3));//9
//		System.out.println(list1.get(9));, 索引越界异常
		
//		int indexOf(Object o)	在list中查询元素第一次出现的索引值，如不存在，返回－1。查询元素对应的下标
		System.out.println(list1.indexOf(9));//3
		System.out.println(list1.indexOf(0));//-1
		list1.add(9);
		System.out.println(list1);//[12, 99, 14, 9, 79, 79, null, null, 9]
		System.out.println(list1.indexOf(9));//3
		/**
		 * List中如果存在多个重复元素，indexOf()方法返回第一个匹配元素的index。
		 * lastIndexOf(o)是返回最后一个匹配元素的index.
		 */
//		int lastIndexOf(Object o)	
		System.out.println(list1.lastIndexOf(9));//8
//		ListIterator listIterator()	返回列表中元素的列表迭代器 
		
//		Object remove(int index)	移除列表中指定位置的元素 ,并且返回移除的元素
		System.out.println(list1.remove(1));
		System.out.println(list1);//[12, 14, 9, 79, 79, null, null, 9]
		list1.add(5,2);
		System.out.println(list1);//[12, 14, 9, 79, 79, 2, null, null, 9]
		list1.remove(2);
		System.out.println(list1);//[12, 14, 79, 79, 2, null, null, 9]

		
//		Object set(int index,Object element)	用指定元素替换列表中指定位置的元素 
		list1.set(3, 89);
		System.out.println(list1);//[12, 14, 79, 89, 2, null, null, 9]
		
//		List集合的遍历
//		方式一：for
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
//		方式二：forEach
//		for(Integer i:list1) {
//			System.out.println(i);
//		}
//		方式三：迭代器
		Iterator it= list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	public static void testArrayList() {
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(14);
		list1.add(9);
		list1.add(79);
		list1.add(79);
		list1.add(0, 8);
		System.out.println(list1);//[8, 12, 14, 9, 79, 79]

	}
	
	public static void testLinkedList() {
		LinkedList<Integer> list1=new LinkedList<>();
		list1.add(12);
		list1.add(14);
		list1.add(9);
		list1.add(79);
		list1.add(79);
		System.out.println(list1);
		System.out.println(list1.get(3));
		list1.add(3,8);
		System.out.println(list1);//[12, 14, 9, 8, 79, 79]
		
//		void addFirst(Object o) 	将给定元素插入此列表的开头 
		list1.addFirst(9);
		System.out.println(list1);//[9, 12, 14, 9, 8, 79, 79]
//		void addLast(Object o) 	将给定元素追加到此列表的结尾 
		
//		Object getFirst()	返回此列表的第一个元素 
		System.out.println(list1.getFirst());//9
//		Object getLast()	返回此列表的最后一个元素 
		System.out.println(list1.getLast());
		
//		Object removeFirst()	移除并返回此列表的第一个元素 
		System.out.println(list1.removeFirst());//9
		System.out.println(list1);//[12, 14, 9, 8, 79, 79]

//		Object removeLast()	移除并返回此列表的最后一个元素 
		System.out.println(list1.removeLast());//79
		System.out.println(list1);//[12, 14, 9, 8, 79]

	}

	public static void main(String[] args) {
//		testArrayList();
//		testLinkedList();
		testList();
	}

}
