package com.Test;

import java.util.HashMap;



public class Jinzhi {
	HashMap map ;
	
	public boolean isContain(String str){
		if(str.contains("A")||str.contains("B")||str.contains("C")||str.contains("D")
				||str.contains("E")||str.contains("F"))
			return false;
		return true;
	}
		public int fun(String a,String b,String c){
			String str =a+b+c;
			int len=a.length();
			int k = 0;
			Character max = 0;
			char[] array = str.toCharArray();
			
				
			return k;
		}
		public static void main(String[] args) {
			System.out.println(new Jinzhi().fun("45", "17", "63"));
		}
}
