package com.nesoft.javase.array;

import java.util.Arrays;

public class ArrayOperation {

	public static void main(String[] args) {
//	数组的排序
//	将数组{2,5,1,78,44,32}升序排序之后输出
	int[] arr1= {2,5,1,78,44,32};	
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
		
//  数组的复制
//	将数组{23,45,7}复制到数组{1,2,3,4,5,6}中,规定复制开始位置为0，目标数组开始位置为3
	int[] source={23,45,7};
	int[] dest= {1,2,3,4,5,6};
	/**
	 * src:源数组
	 * srcpos:源数组开始索引
	 * dest:目标数组
	 * destPos：目标数组开始索引
	 * length：复制的长度
	 * 
	 */
//	System.arraycopy(source, 0, dest, 3, 3);
//	System.out.println(Arrays.toString(dest));//[1, 2, 3, 23, 45, 7]
	System.arraycopy(source, 1, dest, 3, 2);
	System.out.println(Arrays.toString(dest));//[1, 2, 3, 45, 7, 6]
	}

}
