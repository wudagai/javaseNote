package com.nesoft.javase.method;

public class MethodCallCase {
	/**
	 * 法拉利：
	 * 	有钥匙,有油，发动机才能启动，法拉利才能跑起来
	 * 
	 * @param args
	 */
  public static void ferrariRun(boolean key,int oil) {
		if(key && engine(oil)) {
			System.out.println("法拉利跑起来了");
		}else {
			System.out.println("跑不起来");
		}
	}
//	发动机
	public static boolean engine(int oil) {
//		如果油量大于100 能启动
		if(100<oil(oil)) {
			return true;
		}
		return false;
		
	}
//	油量判断 加油
	public static int oil(int oil) {
		return oil+=20;
		
	}

	public static void main(String[] args) {
		ferrariRun(true,80);
	}

}
