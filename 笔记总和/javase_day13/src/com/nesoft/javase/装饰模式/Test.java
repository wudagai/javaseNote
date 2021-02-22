package com.nesoft.javase.装饰模式;


public class Test {

	public static void main(String[] args) {
//		BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream("")));
		CustomerRead re=new CustomerRead(new CustomerStream());
		re.read();

	}

}
