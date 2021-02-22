package com.nesoft.javase.Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapMethod {
	public static void main(String[] args) {
		HashMap<Integer,Object> map1=new HashMap<>();
//		 Object put(Object key,Object value)	将指定的值与此映射中的指定键相关联 
		map1.put(1,"zhangsan");
		map1.put(2, 90);
		System.out.println(map1);//{1=zhangsan, 2=90}
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(3, "lisi");
		map2.put(4, "wangwu");
//		 void putAll(Map t)	将映射t中所有映射关系复制到此映射中 
		map1.putAll(map2);
		System.out.println(map1);//{1=zhangsan, 2=90, 3=lisi, 4=wangwu}
		map2.put(1, "zhaoliu");
		map1.putAll(map2);
		System.out.println(map1);//{1=zhaoliu, 2=90, 3=lisi, 4=wangwu}
//		 Object get(Object key)	返回此映射中映射到指定键的值 
		
//		 Object remove(Object key)	若存在此键的映射关系,将其从映射中移除 ,并且返回移除的value值
		 System.out.println(map1.remove(90));//若没有存在映射关系返回null
		 System.out.println(map1.remove(1));//zhaoliu
		 System.out.println(map1);//{2=90, 3=lisi, 4=wangwu}
		
//		 boolean containsKey(Object key)	若此映射包含指定键的映射关系，返回 true 
//		 通过key判断是否存在指定的键值对
		 System.out.println(map1.containsKey(2));//true
		 if(map1.containsKey(2)) {
			 System.out.println("该键已经存在");
		 }
		 
//		 boolean containsValue(Object value)	若此映射为指定值映射一个或多个键,返回 true 
		 System.out.println(map1.containsValue("lisi"));//true
//		 int size()	返回此映射中的键-值映射对数 
		 System.out.println(map1.size());//3

//		 boolean isEmpty()	若此映射未包含键-值映射关系,返回 true 
		 System.out.println(map1.isEmpty());//false
		 
//		 Set  keySet()	返回此映射中包含的键的 set 集合  将双列集合中存在的key转为Set集合
		 Set<Integer> setKey=map1.keySet();
		 System.out.println(setKey);//[2, 3, 4]
//		 Collection values()	返回此映射中的所有值对象的Collection集合,将双列集合中的value转为单列集合
		 Collection<Object> c=map1.values();
		 System.out.println(c);//[90, lisi, wangwu]

		 
	}

}
