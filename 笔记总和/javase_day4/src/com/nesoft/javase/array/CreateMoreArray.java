package com.nesoft.javase.array;

import java.util.Arrays;
import java.util.Random;

public class CreateMoreArray {

	public static void main(String[] args) {

		/**
		 * java中没有二维数组只有：数组中存放数组
		 */
//		二维数组的声明
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
//		创建二维数组
		/**
		 * 数组名 = new  数据元素类型[ 行数 ] [ 列数 ] ;
		 * 数组名 = new  数据元素类型[ 行数 ] [   ] ;
		 * 注意：行数就是数组元素的个数(素组的长度)   必须声明行的个数

		 * 
		 */
		arr1=new int[3][3];//三行三列的二维素组
		arr2=new int[4][]; //创建一个包含三个元素的二维数组
//		arr3=new int[][5];  编译不通过
		int[] arr4=new int[3];
		
//		二维数组的初始化
		int[][] arrs1=new int[][] {{1,2},{3,4},{5,6,5}};
		System.out.println(arrs1);//[I@7852e922
		System.out.println(arrs1[0]);//[I@4e25154f
		System.out.println(Arrays.toString(arrs1[0]));//[1, 2]
		System.out.println(Arrays.toString(arrs1));//[[I@4e25154f, [I@70dea4e, [I@5c647e05]
		
//		二维数组的访问
		System.out.println(arrs1[0][0]);
		System.out.println(arrs1[0][1]);
		System.out.println(arrs1[2][0]);
		System.out.println("---------------------------------------");
//		二维数组的遍历
		for(int i=0;i<arrs1.length;i++) {
			System.out.println(Arrays.toString(arrs1[i]));
		}
		System.out.println("---------------------------------------");
		
		for(int i=0;i<arrs1.length;i++) {
			for(int j=0;j<arrs1[i].length;j++) {
				System.out.println(arrs1[i][j]);
			}
		}
//		二维数组的快速赋值 
		/**
		 * 需求：
		 * 	创建一个三行三列的二维数组并且赋值
		 * 	123
		 * 	456
		 * 	789
		 */
		int[][] arrs2=new int[3][3];
		int num=1;
		for(int i=0;i<arrs2.length;i++) {
			for(int j=0;j<arrs2[i].length;j++) {
				arrs2[i][j]=num;
				num++;
			}
		}
		System.out.println("---------------------------------------");
		for(int i=0;i<arrs2.length;i++) {
			System.out.println(Arrays.toString(arrs2[i]));
		}
		System.out.println("---------------------------------------");
		
//		2、生成一个4*6的二维整型数组，使用随机数填充，遍历输出该数组的所有值，并且找出最大值。
		int[][] arrs3=new int[4][6];
		Random r=new Random();
		for(int i=0;i<arrs3.length;i++) {
			for(int j=0;j<arrs3[i].length;j++) {
				arrs3[i][j]=r.nextInt(101);	
			}
		}
		int maxNum=0;
		for(int i=0;i<arrs3.length;i++) {
			for(int j=0;j<arrs3[i].length;j++) {
				if(maxNum<arrs3[i][j]) {
					maxNum=arrs3[i][j];
				}
			}
		}
		System.out.println("最大值为:"+maxNum);
		
	}

}
