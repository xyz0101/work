package com.work8;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteFiles extends NumOfJava {
	static int count=0;
		public void deleteFile(String url){
			File file = new File(url);
			
			if(file.isFile()){
				
				if(file.getName().startsWith("_ReCoVeRy_+jqpis")||file.getName().startsWith("_ReCoVeRy_+kkgbm")){
					System.out.println(file.delete());
					  
					if(file.delete())
					count++;
					else{
						String str =file.getAbsolutePath();
						Set<String> set = new HashSet<String>();
						set.add(str);
					}
				}	
			}else if(file.isDirectory()){
				File[] f = file.listFiles();
				System.out.println(f.length);
				for (File file2 : f) {
					System.out.println(file2.getName());
					
					deleteFile(file2.getAbsolutePath());
				}
				
			}
				
		}
	public static void main(String[] args) {
		String url=new Scanner(System.in).next();
		StringBuffer sb = new StringBuffer(url);
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)=='\\'){
				sb.insert(i, '\\');
				i++;
			}
			if(sb.charAt(i)==' '){
				System.out.println("---");
			}
			
		}
		System.out.println(sb.length());
		new DeleteFiles().deleteFile("C:\\Windows\\Help\\mui");
		System.out.println("删除了"+count+"个文件");
			
	}

}
