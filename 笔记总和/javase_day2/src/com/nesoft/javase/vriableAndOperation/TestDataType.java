package com.nesoft.javase.vriableAndOperation;

public class TestDataType {

	public static void main(String[] args) {
//		整型：byte、short、int、long
//		byte  1字节 8位   -2^7~2^7-1(-128~127)
		byte b1=12;
		System.out.println("b1:"+b1); 
//		b1=128;  编译不通过
//		short 2字节 16位 -2^15~2^15-1
		short s1=1234;
		System.out.println("s1:"+s1);
//		int   4字节 32位  -2^31~2^31-1
//		int是java中默认的整型
		int i1=123213;
//	    i1=123123123123;编译不通过 超过int的大小
		System.out.println("i1:"+i1);
//		long  8字节  64位  -2^63~2^63-1
//		声明long类型并给变量赋值时,该值末尾要加上L或者l
		long l1=1231231;  //隐式转换 :int 转 long
		System.out.println("l1:"+l1);
		l1=1231231231231231L;
		System.out.println("l1:"+l1);
		
//		十进制 (0~9) 第一位不能是0  
		int i2=456;
//		八进制(0~7)  必须以0开头    
		i2=045; 	//5*8^0+4*8^1
		System.out.println("i2:"+i2); //37
		i2=012345;  //5*8^0+4*8^1+3*8^2+2*8^3+1*8^4
		System.out.println("i2:"+i2);//5349
//		十六进制  (0 ~ 9  A ~ F)  必须以0X或0x开头
		i2=0x12AF; //15*16^0+10*16^1+2*16^2+1*16^3
		System.out.println("i2:"+i2);//4783
//		JDK7以前版本，没有二进制的整型常量写法，一般用十六进制代替
//		JDK7之后 二进制 (0~1) 必须以0b或0B开头
		i2=0b010110; // 0*2^0+1*2^1+1*2^2+0*2^3+1*2^4+0*2^5
		System.out.println("i2:"+i2);//22
//		由于JDK7以后版本数值常量增加对下划线支持，也可以写成：
		i2=0B0101_0000_1010_0010_1101_0000_1010_0010;
		System.out.println("i2:"+i2);//1352847522
		System.out.println("-----------------------------------------------------------");
		
//		浮点型 float double
		
//		float(单精度--精确到小数点后四位) 4字节  32位      
//		声明float类型并给变量赋值时,该值末尾要加上F或者f
		float f1=1234.565677f;
//		f1=1234.565677; 编译报错  1234.565677是double类型
		System.out.println("f1:"+f1);//1234.5657
		
//		double(双精度--精确到小数点后8位) 8字节  64位
//		double类型时java中默认的浮点型
//		声明double类型并给变量赋值时,该值末尾可以加上d或者D,也可以不加
		double d1=1234.565677; 
		System.out.println("d1:"+d1);//d1:1234.565677
		System.out.println("-----------------------------------------------------------");
//		字符类型 char
//		Java中的字符类型的值通常用英文单引号括起来，代表单个字符
		
//		char能接受什么样类型的数据？
//		接收单个字符
		char c1='中';
		System.out.println("c1:"+c1);
		
//		接收整数 只能接收16位整数  最小值:0, 最大值:65535 = 2^16-1
//		JVM会去找到ascii码,将数值对应的ascii字符输出
//		十进制
		c1=0;
		System.out.println("c1:"+c1);//空串
		c1=49;
		System.out.println("c1:"+c1);//1
		c1=65;
		System.out.println("c1:"+c1);//A
//		十六进制
		c1=0x22;
		System.out.println("c1:"+c1);//"
		
//		接收Unicode字符 
		c1='\u03A6';
		System.out.println("c1:"+c1);//Φ
		c1='\u2220';
		System.out.println("c1:"+c1);//∠
		c1='\u8680';
		System.out.println("c1:"+c1);//蚀
//		字符类型-转义字符
//		使用输出语句，打印出带引号的信息如输出：你好"中国"
		System.out.println("你好\"中国\"");//你好"中国" 
		System.out.print("我爱你\n");
		System.out.print("中国");
		System.out.println("中\t\t国");
		System.out.println("-----------------------------------------------------------");
//		布尔型  boolean:只能接收两个值 true和false
		boolean temp=true;
		temp=1<2;
		System.out.println("temp:"+temp);//true
		temp=2<1;
		System.out.println("temp:"+temp);//false





		



	}

}
