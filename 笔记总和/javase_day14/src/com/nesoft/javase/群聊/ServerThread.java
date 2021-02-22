package com.nesoft.javase.群聊;
/**
 * 服务端线程：不停的接收客户端发送过来的信息，并转发给群里的其他人
 * @author Administrator
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable{
//	依赖于客户端套接字对象
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
//		现接收客户端发送过来的信息，再转发
		try(BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()))){
//			如果客户端有信发送才转发
			String message=null;
			while((message=bf.readLine())!=null) {
//				转发给群里其他人除了自己
				for(Socket s:CustomerServer.socketList) {
					if(s==socket) {
						continue;
					}
					PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
					pw.println(message);
				}
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
