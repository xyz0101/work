package com.Test;

import java.io.File;

public class FileTree {
     public static void main(String[] args) {
		File file = new File("H:/");
		printfile(file,0);
	}

	private static void printfile(File file,int n ) {
		for(int i=0;i<n;i++){
			System.out.print("-");
		}
		System.out.print(file.getName());
		System.out.print("\n");
	
	if(file.isDirectory()){
		File[] f = file.listFiles();
		for(File a : f)
		printfile(a, n+1);
	}
	
}
}