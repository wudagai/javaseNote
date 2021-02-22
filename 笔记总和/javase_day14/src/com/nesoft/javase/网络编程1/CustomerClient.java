package com.nesoft.javase.网络编程1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * @author Administrator
 *
 */
public class CustomerClient {
	public static void main(String[] args) {
//		创建一个客户端套接字 
		/**
		 * Socket(InetAddress address, int port) 
			创建一个流套接字，并将其与指定的IP地址中的指定端口号连接起来。
		 */
		Socket client=null;
		try {
//			client=new Socket("10.25.164.155",45678);
//			127.0.0.1/localhost本地IP
			client=new Socket("localhost",45678);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
