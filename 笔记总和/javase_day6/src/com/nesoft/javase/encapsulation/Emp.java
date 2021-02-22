package com.nesoft.javase.encapsulation;
/**
 * 给属性赋值的方式：
 * 		①通过构造方法
 * 		②通过set方法
 * 
 * @author Administrator
 *
 */
public class Emp {
//	属性私有
	private int age;
	private String name;
	private String address;
	
	
	public Emp(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	 }
	

	public Emp() {
		super();
	}
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(140<age || age<18) {
//			如果年龄输入不合适给默认值为20
			this.age=20;
		}else {
			this.age=age;
		}
//
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	//
//	//	提供共有的访问属性的方法
//	public void setAge(int age) {
//		if(140<age || age<18) {
////			如果年龄输入不合适给默认值为20
//			this.age=20;
//		}else {
//			this.age=age;
//		}
//		
//	}
//	
//	public int getAge() {
//		return age;
//	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", address=" + address + "]";
	}


}
