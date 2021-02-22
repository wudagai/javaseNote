package com.nesoft.javase.Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
//		HasMap 的构造方法 
//		构造一个具有默认初始容量 (16):桶的个数  和默认加载因子 (0.75) 的空 HashMap  
		HashMap map1=new HashMap<>();
		
//		构造一个带指定初始容量和默认加载因子 (0.75) 的空 HashMap
		HashMap map2=new HashMap<>(10);
		
//		构造一个带指定初始容量和加载因子的空 HashMap
		HashMap  map3 = new  HashMap(16,0.5f) ;
		
//		构造一个映射关系与指定 Map 相同的新 HashMap
		HashMap  map4 = new  HashMap(map3) ;
	}

}
