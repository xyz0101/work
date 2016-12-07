package com.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
	
	public static void main(String[] args) {
		int i=0;
		FileReader reader = null;
		char a[] = new char[150];
		try{
			 reader = new FileReader("C:/Users/Administrator/Desktop/新建文本文档.txt");
	     for( i=0;i<150;i++){
			char s = (char) reader.read();
			//char s1 = (char) reader.read();
			if((int)s<0||(int)s>191)
				break;
			a[i]=s;			
	     }for(int j=0;j<i;j++)
	     System.out.print(""+a[j]);
		} catch(FileNotFoundException e){
	    	e.printStackTrace();
	    } 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   finally{
		   try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	   }	    
	}
}
