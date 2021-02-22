package com.nesoft.javase.Map集合;

import java.util.Hashtable;

/**
 * Vector和ArrayList的区别：
 * 			Vector和ArrayList的数据结构都为数组(顺序存储)
 * 			ArrayList线程不安全
 * 			Vector线程安全
 * HashMap和Hashtable的区别：
 * 			HashMap和Hashtable的数据结构都为散列表
 * 			HashMap：线程不安全,并发访问速度快
 * 			Hashtable：线程安全
		 *  HashTable不允许null值，key和value都不可以,HashMap允许null值，key和value都可以。
		 *  HashMap允许key值只能由一个null值，因为hashmap如果key值相同，新的key, value将替代旧的
		 *  
		 *  HashTable中hash数组默认大小是11，增加的方式是 old*2+1。
		 *  HashMap中hash数组的默认大小是16，而且一定是2的指数
		 *  
		 *  TreeMap能够把它保存的记录根据键排序,默认是按升序排序
 * @author Administrator
 *
 */
public class TestMap3 {
	public static void main(String[] args) {
		Hashtable table=new Hashtable<>();
//		table.put(null, "zhangsan");
	}

}
