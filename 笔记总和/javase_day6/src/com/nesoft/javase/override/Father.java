package com.nesoft.javase.override;

public class Father {
	public void getName() {
		System.out.println("Father getName");
	}
	
	public void getResult() {
		this.getName();
	}
}
