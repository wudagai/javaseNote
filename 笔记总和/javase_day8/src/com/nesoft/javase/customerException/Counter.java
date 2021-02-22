package com.nesoft.javase.customerException;

public class Counter {
	public static double getResult(int i,int j) throws AllZeroException {
//		int h=10/0;
//	   如果两个数都为0  抛出都为0异常
		if(i==0 && j==0) {
			throw new AllZeroException("都是0异常");
		}
		return j;
	}
	public static void main(String[] args) {
		try {
			getResult(0,0);
		} catch (AllZeroException e) {
			e.printStackTrace();
		}
	}
}
