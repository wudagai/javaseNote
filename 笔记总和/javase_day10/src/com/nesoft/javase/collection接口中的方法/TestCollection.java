package com.nesoft.javase.collection接口中的方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Collection中的方法:List和Set集合都有的方法
 * @author Administrator
 *
 */
public class TestCollection {
	public static void main(String[] args) {
		Student s=new Student();
//		boolean add(Object)	集合中加入一个对象，成功时返回true
		Set set=new HashSet<>();
		System.out.println(set.toString());//[]
		set.add(1);
		set.add("zhangsan");
		set.add('z');
		set.add(s);
		System.out.println(set);//[1, zhangsan, z]
		
		List list=new ArrayList<>();
		list.add("lisi");
		list.add(45);
		list.add(129);
		System.out.println(list);//[lisi, 45]
		
//		boolean addAll(Collection)	集合中加入另外一个集合对象
		set.addAll(list);
		System.out.println(set);//[1, lisi, 129, zhangsan, z, 45]
//		int size()	集合内容纳的元素数量
		System.out.println(set.size());//6
//		boolean isEmpty()	集合是否为空
		if(list.isEmpty()) {
			System.out.println("可以往list集合中存放数据");
		}else {
			List list1=new ArrayList<>();
			System.out.println(list1.isEmpty());//true
			System.out.println("往新的集合中存放数据");
		}
//		boolean contains(Object)	集合内是否含有参数对象
		System.out.println(set.contains("lisi"));//true
		System.out.println(set.contains(new Student()));//false
		
//		Iterator iterator()	产生一个迭代器
//		Object[] toArray()	返回一个包含所有元素的对象数组  将集合转为数组
		Object[] o=set.toArray();
		System.out.println(Arrays.toString(o));
		
//		boolean remove(Object)	从集合中删除对象
		set.remove(s);
		System.out.println(set);//[1, lisi, 129, zhangsan, z, 45]
//		boolean removeAll(Collection)	清空指定集合  将源集合中包含指定集合的元素全部清除
//		set.removeAll(list);
		System.out.println(set);//[1, zhangsan, z]
		List list2=new ArrayList<>();
		list2.add(1);
		set.removeAll(list2);
		System.out.println(set);//[zhangsan, z]
//		boolean containsAll(Collection)	判断集合内是否包含子集
		System.out.println(set.containsAll(list));//true
		System.out.println(set.containsAll(list2));//false

//		boolean retainAll(Collection)	仅保留此 collection 中那些也包含在指定 collection 的元素
		set.retainAll(list);
		System.out.println(set);//[lisi, 129, 45]
//		void clear()	清空集合
		set.clear();
		System.out.println(set);
		
		Set s1=new HashSet<>();
		s1.add(1);
		s1.add("zhangsan");
		System.out.println(s1);
		
		List list3=new ArrayList<>();
		list3.add("lisi");
		list3.add(2);
		
		System.out.println(list3);
//		s1.addAll(list3);
//		System.out.println(s1);
		s1.add(list3);
		System.out.println(s1);//[1, [lisi, 2], zhangsan]
		
//		set.removeAll(o)
		
		
		
	}

}
