package com.nesoft.javase.网络编程2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
		OutputStream out=null;
		try {
//			client=new Socket("10.25.164.155",45678);
//			127.0.0.1/localhost本地IP
			client=new Socket("localhost",45678);
//			通过socket获取字节流对象
			out=client.getOutputStream();
//			InputStream in=client.getInputStream();
//			客户端给服务器发送一句话：你好，服务器；今天真的好冷
			String message="client:你好，服务器；今天真的好冷";
			out.write(message.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			out.close();  如果在这个客户端处理异常代码繁琐
			DealException.closeResouce(out,null);
		}
	}

}
