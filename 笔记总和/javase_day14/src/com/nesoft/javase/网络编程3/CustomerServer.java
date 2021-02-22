package com.nesoft.javase.网络编程3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * @author Administrator
 * 需求：客户端和服务器完成一次会话：
 * 		客户端：先写后读
 * 		服务器：先读后写
 */
public class CustomerServer {
	public static void main(String[] args) {
//		服务器:ServerSocket(int port),创建一个服务器套接字，绑定到指定的端口。
		ServerSocket server=null;
		Socket socket=null;
		InputStream in=null;
		OutputStream out=null;
		try {
			server=new ServerSocket(45678);
//			返回客户端套接字：保证了客户端和服务器操作用一个套接字流对象
			socket=server.accept();//这个方法会阻塞,等待客户端的连接，一旦有客户端连接那么阻塞解除
			System.out.println("有客户端连接过来了");
			in=socket.getInputStream();
//			服务器读取客户端发送过来的消息
			byte[] b=new byte[1024];
			in.read(b);//这个方法会阻塞，等待客户端发送过来的信息
//			将读到的信息输出到控制台
			System.out.println(new String(b));
//			服务器给客户端发送一条信息
			out=socket.getOutputStream();
			String message="server:是啊  今天真的好冷";
			out.write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			DealException.closeResouce(out,in);
		}
		
		
	}

}
