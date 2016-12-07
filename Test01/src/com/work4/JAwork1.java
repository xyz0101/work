package com.work4;

import java.util.Scanner;

public class JAwork1 {

	
	public static void main(String[] args) {
		String str = "Xyz";
		char c =str.charAt(0);
		System.out.println(c);
		int num ;
		while(true){
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		try {
		 num = Integer.parseInt(str1);
		break;
		} catch (Exception e) {
		}
		}
		System.out.println(num+100);
		System.out.println(Utli.isEmail("1394046585@qq.com"));
	}

}
