package com.nesoft.javase.网络编程5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * @author Administrator
 *
 */
public class CustomerClient {
	public static void main(String[] args) {
		Socket client=null;
		try {
			client=new Socket("localhost",45678);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		/**
		 * try(流对象){语句块}catch(异常对象){处理异常}，注意如果有多个流对象需要使用时用";"隔开即可
		 */

		try(BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw=new PrintWriter(new OutputStreamWriter(client.getOutputStream()),true)//true :表示刷新缓冲区
				){
//			先写后读
//			接收控制台输入的信息并发送给服务器
			Scanner sc=new Scanner(System.in);
//			使用死循环完成一直chat
			while(true) {
			String message="client:"+sc.nextLine();//这个方法会阻塞，等待控制台的输入
			pw.println(message);
			
//			读取从服务器发送过来的信息
			String result=in.readLine();//这个方法会阻塞，等待服务器发送过来的信息
			System.out.println(result);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
