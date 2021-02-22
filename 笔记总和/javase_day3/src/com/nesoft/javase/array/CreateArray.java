package com.nesoft.javase.array;

import java.util.Arrays;

public class CreateArray {

	public static void main(String[] args) {
//		数组的声明
		int[] array1;
		int array2[];
//		数组的创建
		/**
		 * ①数组名 = new  数据元素类型[ 元素个数 ]  --动态初始化:所有元素其实已经被初始化，元素都是默认值
		 * new:内存空间分配符,在堆内存中创建一个对象(开辟一个内存空间)
		 *    数组元素：数组中的每一个数据，称为数组的一个元素
		 *   数组长度：数组元素的个数  
		 *   注意：数组元素的数据类型必须和声明数组的数据类型一致
		 *   
		 *   ②数组类型[ ]   数组名=new 数据元素类型[] {元素1，元素2，…} --静态初始化：是在声明数组的同时就完成创建和初始化工作(初始化自定义值)
		 *   
		 *   ③数组类型[ ]  数组名 ={元素1，元素2，…}--静态初始化：是在声明数组的同时就完成创建和初始化工作(初始化自定义值)
		 */
//		以这种方式创建的数组,数组元素有默认值，int-0  double-0.0   引用数据类型-null char-0对应的字符  boolean-false
		int[] arr1=new int[3];//3是数组的长度 
		System.out.println("arr1:"+arr1);//@7852e922
		System.out.println("arr1:"+Arrays.toString(arr1));//[0, 0, 0]
		String[] arr2=new String[4];
		System.out.println("arr2:"+Arrays.toString(arr2));//[null, null, null, null]
		
		int[] arr3=new int[] {1,2,3,67};//数组长度为4
		System.out.println("arr3:"+Arrays.toString(arr3));//[1, 2, 3, 67]
		
		int[] arr4= {2,5,7};
		System.out.println("arr4:"+Arrays.toString(arr4));//[2, 5, 7]
//		数组的访问  
//		数组是一种数据结构：顺序存储,在物理地址连续的两个元素在内存地址中也连续,数组是有序的，有索引，索引从0开始
//		数组的长度
		System.out.println(arr4.length);//3
//		通过数组下标(索引)访问数组
		System.out.println(arr4[1]);//5
//		注意：索引最大值为length-1 最小值为0 
//		System.out.println(arr4[3]);//java.lang.ArrayIndexOutOfBoundsException 索引越界异常
		
//		数组的赋值
		arr4[0]=20;
		System.out.println("arr4:"+Arrays.toString(arr4));//[20, 5, 7]
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
//		注意：只能对数组中的元素进行修改不能改变数组的长度，数组是定长
		System.out.println("arr1:"+Arrays.toString(arr1));//arr1:[1, 2, 3]
		
//		遍历数组 使用for循环
		/*for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}*/
//		使用foreach：加强for循环
		/**
		 * for(容器中的元素数据类型  变量：容器对象){
		 * 	
		 * }
		 * 
		 */
		for(int i:arr4) {
			System.out.println(i);
		}

	}

}
