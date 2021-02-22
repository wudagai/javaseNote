package com.nesoft.javase.集合的转换;

import java.util.ArrayList;
import java.util.HashSet;

public class TestTransform {

	public static void main(String[] args) {
//		set转List
		HashSet<Integer> set=new HashSet<>();
		set.add(12);
		set.add(9);
		System.out.println(set);
		
		ArrayList<Integer> list=new ArrayList<>(set);
		System.out.println(list);
		
//		List转Set
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(12);
		list1.add(12);
		list1.add(11);
		
		HashSet<Integer> set1=new HashSet<>(list1);
		System.out.println(set1);//[11, 12]
		
		
	}

}
