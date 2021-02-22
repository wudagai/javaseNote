package com.nesoft.javase.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 使用处理流让字节流变字符流
 * @author Administrator
 *
 */
public class TestDisposeStream {
	public static void testOne() {
		File source=new File("D:/a.txt");
		File dest=new File("D:/b.txt");
//		使用字节流读写
//		搭建输入输出管道
		FileInputStream in=null;
		FileOutputStream out=null;
//		处理流：使字节流变字符流
		InputStreamReader in_r=null;
		OutputStreamWriter out_w=null;
		try {
//			通过输入输出管道完成文件的读写:读一次写一次
			in=new FileInputStream(source);
			out=new FileOutputStream(dest);
			in_r=new InputStreamReader(in);
			out_w=new OutputStreamWriter(out);
			int a=0;
			while((a=in_r.read())!=-1) {
				out_w.write(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				关闭流:先关闭处理流在关闭节点流
				in_r.close();
				out_w.close();
				in.close();
				out.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		testOne();
	}

}
