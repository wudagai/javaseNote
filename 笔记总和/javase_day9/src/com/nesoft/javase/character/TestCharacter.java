package com.nesoft.javase.character;

public class TestCharacter {

	public static void main(String[] args) {
		char c='中';
		Character cc=c;
		System.out.println(cc);
		Character c1='中';
		System.out.println(c1);
//		String toString(char)  char-String
		System.out.println(Character.toString('在'));
		System.out.println(Integer.MAX_VALUE);//2147483647
		
//		static boolean isDigit(char ch)	判断字符ch是否为数字
		System.out.println(Character.isDigit('A'));//false
		System.out.println(Character.isDigit('8'));//true
		
//		static boolean isLetter(char ch)	判断字符ch是否为字母或中文
		System.out.println(Character.isLetter('中'));//true
		System.out.println(Character.isLetter('Z'));//true
		System.out.println(Character.isLetter('国'));//true
		System.out.println(Character.isLetter('@'));//false

//		static boolean isLowerCase(char ch)	判断字符ch是否为小写字母
		System.out.println(Character.isLowerCase('a'));//true
		System.out.println(Character.isLowerCase('A'));//false

//		static boolean isSpaceChar(char ch)	判断字符ch是否为Unicode中的空格
		System.out.println(Character.isSpaceChar(' '));//true

	}

}
