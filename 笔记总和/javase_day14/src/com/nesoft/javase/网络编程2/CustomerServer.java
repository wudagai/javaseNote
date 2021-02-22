package com.nesoft.javase.网络编程2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * @author Administrator
 * 需求：客户端和服务器进行连接
 */
public class CustomerServer {
	public static void main(String[] args) {
//		服务器:ServerSocket(int port),创建一个服务器套接字，绑定到指定的端口。
		ServerSocket server=null;
		Socket socket=null;
		InputStream in=null;
		try {
			server=new ServerSocket(45678);
//			返回客户端套接字：保证了客户端和服务器操作用一个套接字流对象
			socket=server.accept();//这个方法会阻塞,等待客户端的连接，一旦有客户端连接那么阻塞解除
			System.out.println("有客户端连接过来了");
			in=socket.getInputStream();
//			服务器读取客户端发送过来的消息
			byte[] b=new byte[1024];
			in.read(b);
//			将读到的信息输出到控制台
			System.out.println(new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			DealException.closeResouce(null,in);
		}
		
		
	}

}
