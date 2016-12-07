package com.work8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DOS {
	public static void main(String[] args) {
		System.out.println("¼òÒ×DOSÏµÍ³");
		String input = "\\";
		File file= new File(input);
		System.out.println(file.getAbsolutePath()+">");
		while(!(input = new Scanner(System.in).next()).equals("exit"))
		 
		if(input.startsWith("cd")){
			file = new File(input.split("_")[1]);
			System.out.println(file.getAbsolutePath()+">");
		}else if(input.equals("dir")){
		File[] f = file.listFiles();
		for (File ff : f) {
			String type = null;
			String   size = null;
			String TheFile;
			Date d = new Date(ff.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			
			
			if(ff.isDirectory()){
				size="\t\t";
				type="  <DIR>  ";
			}
			else if(ff.isFile()){
				if(ff.length()>=1024&&ff.length()<1024*1024)
				size=ff.length()/1024+"KB\t\t";
				else if(ff.length()<1024)
					size=ff.length()+"B\t\t";
				else if(ff.length()>=1024*1024)
					size=ff.length()/1024/1024+"MB\t\t";
				type="         ";
			}
			System.out.print(sdf.format(d));
			System.out.print(type);
			System.out.print(size);
			System.out.println(ff.getName());
		}
		}
	}
}
