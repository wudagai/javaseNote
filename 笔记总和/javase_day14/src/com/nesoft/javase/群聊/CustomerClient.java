package com.nesoft.javase.群聊;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 群聊客户端
 * @author Administrator
 *
 */
public class CustomerClient {
	public static void main(String[] args) {
		try {
//			开始聊天：一边发送消息一遍接收消息互不干扰
//			main线程：不停的发送消息给服务器
			Socket client=new Socket("localhost",45678);
//			客户端线程：不停的接收服务器发送过来的信息
			new Thread(new ClientThread(client)).start();;
			Scanner sc=new Scanner(System.in);
			while(true) {
				String message=sc.nextLine();
				PrintWriter pw=new PrintWriter(new OutputStreamWriter(client.getOutputStream()),true);
				pw.println(message);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}

}
