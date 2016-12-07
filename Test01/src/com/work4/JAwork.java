package com.work4;

public class JAwork {

	public static void main(String[] args) {

		String str = "  hello   ";
		int sum=0;
		System.out.println(str.trim()+str.trim().length());
		str="345_123_23";
		String[] str1 =str.split("_");
		for (int i = 0; i < str1.length; i++) {
			sum+=Integer.parseInt(str1[i]);
		}System.out.println(sum);
			str="13822546859";
			if(str.startsWith("138")&&str.length()==11)
				System.out.println(true);
			str="123A456";
			String[] str2 =str.split("A");sum=0;
			for (int i = 0; i < str2.length; i++) {
				sum+=Integer.parseInt(str2[i]);
			}System.out.println(sum);
	}

}
