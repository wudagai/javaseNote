package com.nesoft.javase.practice;

public class Person {
//	名字
	String name;
//	武器
	String weapons;
//	战斗力
	String fighting;
//	耐力
	String endurance;

//	输出对象的属性信息
	public String getResult() {

		return "["+"name:"+name+" weapons:"+weapons+" fighting:"+fighting+" endurance:"+endurance+"]";
	}
	public static void main(String[] args) {
//		孙悟空
		Person sunwukong =new Person();
		sunwukong.name="孙悟空";
		sunwukong.weapons="金箍棒";
		sunwukong.fighting="*****";
		sunwukong.endurance="*****";
//		唐僧
		Person tangseng =new Person();
		tangseng.name="唐僧";
		tangseng.weapons="无";
		tangseng.fighting="无";
		tangseng.endurance="*****";
		
	
		System.out.println(sunwukong.getResult());
		System.out.println(tangseng.getResult());
				

	}

}
