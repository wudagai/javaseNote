package com.nesoft.javase.网络编程1;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * 服务器
 * @author Administrator
 * 需求：客户端和服务器进行连接
 */
public class CustomerServer {
	public static void main(String[] args) {
//		服务器:ServerSocket(int port),创建一个服务器套接字，绑定到指定的端口。
		ServerSocket server=null;
		try {
			server=new ServerSocket(45678);
			server.accept();//这个方法会阻塞,等待客户端的连接，一旦有客户端连接那么阻塞解除
			System.out.println("有客户端连接过来了");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
