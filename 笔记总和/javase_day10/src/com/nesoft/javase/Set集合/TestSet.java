package com.nesoft.javase.Set集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合:
 * 		特点：三无产品  无序、无索引、无重复值
 * 			①set集合是无序的、无索引
 * 			②无重复值
 * 			③可以有null值，但只能有一个null值
 * 			
 * @author Administrator
 *	HashSet:基于散列表(hash表)--数组+链表
 *	TreeSet:基于红黑树
 *			①无重复值
 *			②默认升序排序,无索引
 *			③不能有null值
 *		
 */
public class TestSet {

	public static void main(String[] args) {
		Set set=new HashSet<>();
		set.add("zhangsan");
		set.add("lisi");
		set.add(1);
		System.out.println(set);//[lisi, 1, zhangsan]
		set.add("zhangsan");
		System.out.println(set);//[lisi, 1, zhangsan]
		set.add(null);
		System.out.println(set);//[null, lisi, 1, zhangsan]
		set.add(null);
		System.out.println(set);//[null, lisi, 1, zhangsan]
		
		Set set1=new TreeSet<>();
		set1.add("zhangsan");
		set1.add("zhangsan");
		System.out.println(set1);//[zhangsan]
		set1.add("lisi");
		set1.add("abc");
		System.out.println(set1);//[abc, lisi, zhangsan]
		
		Set set2=new TreeSet<>();
		set2.add(20);
		set2.add(9);
		set2.add(11);
		set2.add(1);
		set2.add(25);
		set2.add(30);
		set2.add(21);
		System.out.println(set2);//[1, 9, 11, 20, 21, 25, 30]

//		因为集合什么类型的对象都能放，为了方便数据的分类管理存储到集合中，一般指定集合中存放数据的类型
		Set<String> set3=new HashSet<>();
		set3.add("zhangsan");
//		set3.add(12); 编译不通过
		Set<Double> set4=new HashSet<>();
		set4.add(90.0);
		set4.add(90.9);
		
//		遍历set集合
//		方式一：forEach
//		for(Object o:set1) {
//			System.out.println(o);
//		}
		
//		方式二：Iterator iterator() 产生一个迭代器
		Iterator it=set2.iterator();
		while(it.hasNext()) {//hasNext() 判断迭代器是否有下一个值，如果有值，获取值
			System.out.println(it.next());//it.next() 返回指针的下一个值
		};

	}

}
