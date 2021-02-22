package com.nesoft.javase.群聊;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;import java.util.zip.InflaterInputStream;

/**
 * 客户端聊天线程:不停的接收服务器发送过来的信息
 * @author Administrator
 *
 */
public class ClientThread implements Runnable{
//	依赖于每个socket对象
	private Socket socket;
	public ClientThread(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
//		如果服务器有转发信息过来那么读取并输出到控制台
		try(BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()))){
			String result=null;
			while((result=bf.readLine())!=null) {
				System.out.println(Thread.currentThread().getName()+result);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
