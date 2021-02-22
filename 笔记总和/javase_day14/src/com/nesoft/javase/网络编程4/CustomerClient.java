package com.nesoft.javase.网络编程4;

import java.io.InputStream;
import java.io.OutputStream;
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

		try(OutputStream out=client.getOutputStream();
				InputStream in=client.getInputStream()){
//			先写后读
//			接收控制台输入的信息并发送给服务器
			Scanner sc=new Scanner(System.in);
//			使用死循环完成一直chat
			while(true) {
			String message="client:"+sc.nextLine();//这个方法会阻塞，等待控制台的输入
			out.write(message.getBytes());
			
//			读取从服务器发送过来的信息
			byte[] b=new byte[1024];
			in.read(b);//这个方法会阻塞，等待服务器发送过来的信息
			System.out.println(new String(b));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
