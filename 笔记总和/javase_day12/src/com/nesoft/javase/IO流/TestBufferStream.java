package com.nesoft.javase.IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
//	开辟缓冲区读写
	public static void testBufferStream() {
		File source=new File("D:/a.txt");//源文件
		File dest=new File("D:/b.txt");
//		搭建缓冲流管道  
		BufferedReader bf=null;
		BufferedWriter bw=null;
		try {
			bf=new BufferedReader(new FileReader(source));
			bw=new BufferedWriter(new FileWriter(dest));
//			一行一行进行读写
//			String message=bf.readLine();//读一行  如果读不到数据返回null
			String message=null;
			while((message=bf.readLine())!=null) {
				bw.write(message);
				bw.newLine();//相当于敲回车  换行
				bw.flush();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bf.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		testBufferStream();


	}

}
