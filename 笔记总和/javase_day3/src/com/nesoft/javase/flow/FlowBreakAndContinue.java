package com.nesoft.javase.flow;

public class FlowBreakAndContinue {

	public static void main(String[] args) {
//   循环中断
//	 break或continue语句
		/**
		 * break直接跳出循环或者switch语句
		 * 		break 语句用于终止最近的封闭循环或它所在的 switch 语句。控制传递给终止语句后面的语句。
		 * 		可以出现在while、do…while、for、switch语句体中。
		 * continue:跳出当前循环执行下一次循环
		 * 		语句将控制权传递给它所在的封闭迭代语句的下一次迭代
		 * 		只能出现在循环语句while、do…while、for中
		 */
//		只想输出1到4行数据
	/*	for(int i=1;i<=9;i++) { //行
			if(i==5) {
				break; //直接跳出循环
			}
			for(int j=1;j<=i;j++) { //列
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");//换行
			
		}*/
//		第五行数据不输出其他都输出
		for(int i=1;i<=9;i++) { //行
			if(i==5) {
				continue; //跳出当前循环执行下一次循环
			}
			for(int j=1;j<=i;j++) { //列
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");//换行
		}
		System.out.println("-----------------------");
		

//		只想输出1~4列数据
		for(int i=1;i<=9;i++) { //行
			for(int j=1;j<=i;j++) { //列
				if(j==5) {
					break;
				}
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");//换行
		}
//		第五列数据不输出其他都输出
		for(int i=1;i<=9;i++) { //行
			for(int j=1;j<=i;j++) { //列
				if(j==5) {
					continue;
				}
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");//换行
		}
		
//		continue label中断 :给for循环起别名
		outer:for(int i=1;i<=9;i++) { //行
			inner:for(int j=1;j<=i;j++) { //列
				if(i==2) {
					break outer;
				}
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");//换行
		}
		
	}
}

