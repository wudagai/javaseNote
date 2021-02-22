package com.nesoft.javase.网络编程5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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

		try(BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true)//true :表示刷新缓冲区
				){
//			先读后写
//			接收控制台输入的信息并发送给服务器
			Scanner sc=new Scanner(System.in);
//			使用死循环完成一直chat
			while(true) {
//			读取从客户端发送过来的信息
			String result=in.readLine();//这个方法会阻塞，等待客户端发送过来的信息
			System.out.println(result);			
			
			String message="client:"+sc.nextLine();//这个方法会阻塞，等待控制台的输入
			pw.println(message);
			
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
