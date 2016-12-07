package com.work7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFile {
		public static void main(String[] args) {
			File file = new File("Tfile/2.txt");
			try {
				FileInputStream fis = new FileInputStream(file);
				for (int i = 0; i < file.length(); i++) {
					try {
						System.out.println((char)fis.read());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			File[] f = file.listFiles();
//			for (File file2 : f) {
//				System.out.println(file2.getName());
//			}
			
		}
}
