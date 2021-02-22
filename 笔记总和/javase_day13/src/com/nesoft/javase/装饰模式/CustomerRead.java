package com.nesoft.javase.装饰模式;
/**
 * 处理流(字符流)：让字节流中的方法功能变得更强大
 * @author Administrator
 *
 */
public class CustomerRead {
//	想对字节流中的方法进行改造，必须依赖字节流对象
	private CustomerStream customerStream;
	public CustomerRead(CustomerStream customerStream) {
		this.customerStream=customerStream;
	}
	public void read() {
		customerStream.read();
		System.out.println("改造成一个一个字符读写");
	}
}
