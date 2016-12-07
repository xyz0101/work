package com.work4;

public class Utli {

	public static boolean isContainatdian(String str){
		if(str.contains(".")&&str.contains("@"))
			return true;
		return false;	
	}
	public static boolean isForL(String str){
		if(str.startsWith(".")||str.startsWith("@")||str.endsWith(".")||str.endsWith("@"))
			return false;
		return true;
	}
	public static boolean isOnce(String str){
		if(str.indexOf("@")==str.lastIndexOf("@"))
			return true;
		return false;
		
	}
	public static boolean isBefore(String str){
		if(str.indexOf(".")>str.lastIndexOf("@"))
			return true;
		return false;
		
	}
	public static boolean isNext(String str){
		char[] ch = str.toCharArray(); 
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='.')
				if(ch[i+1]=='.'||ch[i-1]=='.')
			return false;
		}
		return true;	
	}
	public static boolean isEnd(String str){
		if(str.endsWith(".com")||str.endsWith(".cn")||str.endsWith(".org")||str.endsWith(".net"))
			return true;
		return false;	
	}
	public static boolean isEmail(String str){
		if(isContainatdian(str)&&isForL(str)&&isOnce(str)&&isBefore(str)&&isNext(str)&&isEnd(str))
			return true;
		return false;
	}
}
