package com.nesoft.javase.vriableAndOperation;

public class DateTypeTransfer {

	public static void main(String[] args) {
//		隐式转换：①两种类型彼此兼容②目标类型的取值范围要大于源类型(简单来说小范围转大范围)
		byte b1=12;
		short s1=b1; // byte转short
		System.out.println("s1:"+s1);
		int i1=s1;	 //short转int
		long l1=i1;  //int 转long
		l1=213123;	//int 转long
		double d1=1234.45f;// float 转 double
//		浮点型的范围比整型的大 int<float  long<float float<double
		float f2=12345;  //int 转float
		System.out.println("f2:"+f2);//12345.0
		f2=123123L;
		System.out.println("f2:"+f2);//123123.0
		
//		在计算时byte、short、char之间不会相互转换，他们三者在计算时首先会转换为int类型
		byte b2=10;
		short s2=20;
		char c2=49;//1
		System.out.println("c2:"+c2); //1
		int c3=c2;
		System.out.println("c3:"+c3); //49
		System.out.println("c2:"+(int)c2); //49
		int s3=b2+s2+c2;
		System.out.println("s3:"+s3); //79
//		计算得到的最终结果的数据类型为计算数中最大的数据类型
		double d2=12.4+123.5f+12;
		System.out.println("d2:"+d2); //147.9

//		显示转换(强制转换) :当两种类型彼此不兼容或者目标类型取值范围小于源类型(简单来说大范围转小范围)
//		注意：大范围可以强制转小范围类型,但是容易精度丢失,后果自负
//		    在强制类型转换过程中，源类型的值可能大于目标类型，因此可能造成精度降低或溢出，使用时需注意
		int ii1=100;
		byte bb1=(byte) ii1; // int 转 byte
		System.out.println("bb1:"+bb1);//bb1:100
		
		float ff1=(float)123.45;// double 转 float
		System.out.println("ff1:"+ff1);//ff1:123.45
		
//		float 转 int
		int ii2=(int) ff1;
		System.out.println(ii2);
		
//		java中以补码的形式存储数值型数据,当访问时将补码转为原码显示
		/**
		 * 最高位为符号位：整数是0  负数是1
		 * 正数的原码和补码以及反码都是同一个数
		 * 
		 * 负数的反码：原码符号位不变其余取反
		 * 负数的补码：反码+1
		 * 
		 * 负数补码转原码：
		 * 	补码转反码：补码-1
		 * 	反码转原码：原码符号位不变其余取反

		 */
		int ii3=129; //0000...1000 0001
		byte bb3=(byte)ii3;  //补码：1000 0001  反码：1000 0000  原码：1111 1111
		System.out.println("bb3:"+bb3);//-127
		 
		int ii4=9;//原码：0000...0000 1001 反码：0000...0000 1001 补码：0000...0000 1001
		int ii5=-9;//原码：1000...0000 1001 反码：1111...1111 0110    补码： 1111...1111 0111
		System.out.println("ii5:"+ii5);//-9
		
		
		
		
		

	}

}
