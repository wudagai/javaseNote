package com.nesoft.javase.序列化;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -7806917925L;
	
	String name;
	int age;
	static String address;
	transient String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String address, String password) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", password=" + password + "]";
	}
	

}
