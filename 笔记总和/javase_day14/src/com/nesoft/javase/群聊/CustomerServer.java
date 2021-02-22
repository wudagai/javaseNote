package com.nesoft.javase.群聊;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *	群聊服务端
 * @author Administrator
 *
 */
public class CustomerServer {
//	由于线程对象需要操作集合，所有声明成静态的，而且为了避免并发操作数据不一致，给集合上锁
	public static  List<Socket> socketList=Collections.synchronizedList(new ArrayList<>());

	public static void main(String[] args) {
		
		ServerSocket server=null;
		try {
			server=new ServerSocket(45678);
//			main:不同的接收客户端的连接，并将接收到的socket放入List集合中
			while(true) {
				Socket socket=server.accept();
				socketList.add(socket);
				new Thread(new ServerThread(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
