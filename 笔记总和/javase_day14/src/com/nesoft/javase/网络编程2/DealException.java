package com.nesoft.javase.网络编程2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DealException {
//	关闭字节流资源
	public static void  closeResouce(OutputStream out,InputStream in) {
//		非空判断
		if(out!=null) {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(in!=null) {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
