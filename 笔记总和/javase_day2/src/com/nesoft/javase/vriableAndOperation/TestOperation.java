package com.nesoft.javase.vriableAndOperation;

import java.util.Date;

public class TestOperation {

	public static void main(String[] args) {
//		运算符的种类：
//		赋值运算符：=、+=、﹣=、*=、/=、%=
		int i=10;
		System.out.println("i:"+i);
		i+=20; //i=i+20
		System.out.println("i:"+i);
//		注意 ：求整时,结果的符号遵循 负负得正  负正得负
		i/=4; // i=i/2  30/4
		System.out.println("i:"+i);//7
//		注意 ：求余时,结果的符号遵循 ：和被除数的符号一致
		i%=4; // i=i%4  7%4
		System.out.println("i:"+i);//3

//		算术运算符： +、﹣、*、/、%、++、 --
//		++ 自增   -- 自减
		int i1=10;
		i1++;
		System.out.println("i1:"+i1);//11
		i1--;
		System.out.println("i1:"+i1);//10
//		注意：如果++放在变量后面是先赋值给表达式,再计算；如果++放在变量前面是先计算得到结果后再赋值给表达式
		int i2=10;
		System.out.println(i2++);//10
		System.out.println(i2); //11
		int i3=i2++;
		System.out.println(i3);//11
		System.out.println(i2);//12
		++i2;
		System.out.println(i2);//13
		int i4=++i2;
		System.out.println(i4);//14
		System.out.println(i2);//14
		
		int z=i4++;  
		System.out.println(z);// z =14
		System.out.println(i4); // i4=15
		i4--;       
		System.out.println(i4);//i4=14
		i2=z-- + ++i4;  //14 + 15
		System.out.println(i2); // 29
		System.out.println(z); // 13
		System.out.println(i4);// 15
		i4=i2++/i4;
		System.out.println(i4);//1
		System.out.println("--------------------------------------------");
//		比较运算符：>、<、>=、 <=、= =、!=、instanceof
//		注意：运算的结果返回值为boolean
		boolean t1= 1<2;
		System.out.println("t1:"+t1);//t1:true
//		== :用于基本数据类型比较时,比较的是两个值内容是否相等
//		== :用于引用数据类型比较时，比较的是两个对象的物理地址是否相等(后面再讲解)
		System.out.println(1==2);//false
		System.out.println(4==4);//true
//		!= 判断两个基本数据类型的内容是否不相同  或者引用数据用来非空判断
		System.out.println(1!=2);//true
		String username="zhangsan"; //引用数据类型
		System.out.println(username!=null);//true
		String password=null;
		System.out.println(password!=null);//false
//		instanceof 判断某个对象(引用数据类型)是否属于某一类型
		System.out.println(username instanceof String);//true
		Date d=new Date();
		System.out.println(d instanceof Date);//true
		System.out.println("--------------------------------------------");
//		逻辑运算符：!、&&、||
//		返回值是boolean值
		
//		&&与   表达式A&&表达式B  A和B都为true整个逻辑表达式才为true,否则为false
//		注意：表达式A和表达式B的返回值必须为boolean
		boolean t2=1<2 && 3<4;
		System.out.println("t2:"+t2);//t2:true
		t2=2<1 && 3<4;
		System.out.println("t2:"+t2);//t2:false
		
		int money=20000;//存款
		boolean home=true;//有房
		boolean married =2000000<money && home;
		System.out.println("married:"+married);//married:false
		
//		||或   表达式A||表达式B  A和B都为false整个逻辑表达式才为false,否则为true,A或B只要有一个为true整个表达式就为true	
		t2=2<1 || 3<4;
		System.out.println("t2:"+t2);//t2:true
		t2=2<1 || 4<3;
		System.out.println("t2:"+t2);//t2:false
		married =2000000<money || home;
		System.out.println("married:"+married);//married:true
		
//		! boolean取反  true取反为false  false取反为true
		System.out.println(!(2000000<money || home));//false
		System.out.println(!false);//true
		
//		位运算符： &、|、^ 、 ~、>>、<<、>>>
//		计算功能：只对byte、short、char、int、long有效  需要将计算数转为二进制再计算
//		按位 & ：只有参加运算的两位都为1，&运算的结果才为1，否则为0
		int ii1=9&3;
		/**
		 *  1001
		 *  0011
		 *  0001
		 * 
		 */
		System.out.println("ii1:"+ii1);//1
//		按位 | ：只有参加运算的两位都为0，|运算的结果才为0，否则为1
		/**
		 *  1001
		 *  0011
		 *  1011
		 * 
		 */
		ii1=9|3;
		System.out.println("ii1:"+ii1);//11
//		^ 异或  只有参加运算的两位不同，^运算的结果才为1，否则为0
		/**
		 *  1001
		 *  0011
		 *  1010
		 * 
		 */
		ii1=9^3;
		System.out.println("ii1:"+ii1);//10
//		<<左移：a<<b,将a的二进制(补码)数据左移b位，右边移空的部分补0
//		口令：a<<n  a*2^n
//		注意：符号位一起移动  ,不管整数还是负数移动的都是补码
		/**
		 * 0000...0000 1001
		 * 0000...0100 1000
		 * 
		 * -9的原码：
		 * 1000...0000 1001
		 * 反码：1111...1111 0110
		 * 补码：1111...1111 0111
		 * 左移三位：1111...1011 1000
		 * 补码转反码：1111...1011 0111
		 * 反码转原码：1000...0100 1000
		 */
		ii1=9<<3;
		System.out.println("ii1:"+ii1);//72
		ii1=-9<<3;
		System.out.println("ii1:"+ii1);//-72
		ii1=14<<5; 
		System.out.println("ii1:"+ii1);//448

//     >> 右移  a>>b,将a的二进制数据右移b位，如果最高位是0，则左边移空的部分补0，如果最高位是1，则左边移空的部分补1
//		口令：a>>n 正数 a/2^n 负数：a/2^n-1
		/**
		 * 0000...0000 1001
		 * 0000...0000 0001
		 * 
		 * -9的原码：
		 * 1000...0000 1001
		 * 反码：1111...1111 0110
		 * 补码：1111...1111 0111
		 * 右移三位：1111...1111 1110
		 * 补码转反码：1111...1111 1101
		 * 反码转原码：1000...0000 0010
		 */
		ii1=9>>3;
		System.out.println("ii1:"+ii1);//1
		ii1=-9>>3;
		System.out.println("ii1:"+ii1);//-2
		ii1=17>>2;
		System.out.println("ii1:"+ii1);//4
		ii1=-17>>2;
		System.out.println("ii1:"+ii1);//-5
		ii1=69>>2;
		System.out.println("ii1:"+ii1);//17
		ii1=-69>>2;
		System.out.println("ii1:"+ii1);//-18
//		条件运算符： ?：
//		条件运算符很独特，因为它是用三个操作数组成的三元运算符。

	}

}
