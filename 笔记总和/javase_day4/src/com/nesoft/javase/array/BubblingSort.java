package com.nesoft.javase.array;

import java.util.Arrays;

/**
 *  冒泡排序
 * @author Administrator 
 * 选择排序
 * 快速排序
 * 希尔排序
 */
public class BubblingSort {
	public static void main(String[] args) {
//		将数组{2,5,1,78,44,32}升序排序之后输出
	int[] arr1= {2,5,1,78,44,32};//6个数
	 for(int j=1;j<arr1.length;j++) {
		for(int i=0;i<arr1.length-1;i++) {
			if(arr1[i+1]<arr1[i]) {
				int temp=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=temp;
			}
		}
		System.out.println("第"+j+"轮"+Arrays.toString(arr1));
	}
	 System.out.println("--------------------------------------");
	 for(int j=1;j<arr1.length;j++) {
		for(int i=0;i<arr1.length-j;i++) {
			if(arr1[i+1]<arr1[i]) {
				int temp=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=temp;
			}
		}
		System.out.println("第"+j+"轮"+Arrays.toString(arr1));
	}
	 System.out.println("--------------------------------------");
	 for(int j=0;j<arr1.length-1;j++) {
		for(int i=0;i<arr1.length-j-1;i++) {
			if(arr1[i+1]<arr1[i]) {
				int temp=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=temp;
			}
		}
		System.out.println("第"+j+"轮"+Arrays.toString(arr1));
	}
//		将数组{2,5,1,78,44,32}降序排序之后输出
	 System.out.println("--------------------------------------");
	 for(int j=0;j<arr1.length-1;j++) {
		for(int i=0;i<arr1.length-j-1;i++) {
			if(arr1[i+1]>arr1[i]) {
				int temp=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=temp;
			}
		}
		System.out.println("第"+j+"轮"+Arrays.toString(arr1));
	}
	}
}
