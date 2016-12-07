package com.work8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
	public static void main(String[] args) {
		File file = new File("e:\\t.txt");
		try {
//			FileWriter fw = new FileWriter(file,true);
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("你好，小样");
//			bw.newLine();
//			bw.write("小样，你坏");
//			String str = "小样，你坏坏！！！";
//			for (int i = 0; i < str.toCharArray().length; i++) {
//				bw.append(str.toCharArray()[i]);
//			}
//			bw.close();
//			fw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String b;
			while((b = br.readLine())!=null)
			System.out.println(b);
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.getAbsolutePath());
		
	}
		
}
