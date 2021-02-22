package com.nesoft.javase.practice;

public class Players {
	private static int sum;
	private Players() {
		
	}
	public static Players create() {
		
		if(sum<11) {
			sum++;
			return new Players();
		}else {
			System.out.println("已经创建了十一个对象");
		}
		
		return null;
		
	}
	public static void main(String[] args) {
		for(int i=0;i<12;i++) {
			System.out.print(Players.create());
			System.out.println(i);
			
		}
		
	}
}
