package com.nesoft.javase.网络编程4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务器
 * @author Administrator
 * 需求：客户端和服务器完成一次会话：
 * 		客户端：先写后读
 * 		服务器：先读后写
 */
public class CustomerServer {
	public static void main(String[] args) {
//		创建服务器
		ServerSocket server=null;
		Socket socket=null;
		try {
			server=new ServerSocket(45678);
			socket=server.accept();//返回客户端套接字
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(OutputStream out=socket.getOutputStream();
				InputStream in=socket.getInputStream()){
			Scanner sc=new Scanner(System.in);
//			使用死循环完成一直chat
			while(true) {
//			先读后写
//			读取从客户端发送过来的信息
			byte[] b=new byte[1024];
			in.read(b);//这个方法会阻塞，等待客户端发送过来的信息
			System.out.println(new String(b));
//			接收控制台输入的信息并发送给客户端
			
			String message="server:"+sc.nextLine();//这个方法会阻塞，等待控制台的输入
			out.write(message.getBytes());	
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
