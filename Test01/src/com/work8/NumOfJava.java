package com.work8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NumOfJava {
		static 	List<File> list = new ArrayList<File>();
		public static List<File> checkFile(String url){
			File file = new File(url);
			for (int i = 0; i < file.listFiles().length; i++) {
				if(file.listFiles()[i].isFile()&&file.listFiles()[i].getName().toLowerCase().endsWith(".java"))
					list.add(file.listFiles()[i]);
				else if(file.listFiles()[i].isDirectory())
					checkFile(file.listFiles()[i].getAbsolutePath());
			}		
			return list;
		}
		public static void main(String[] args) {
			List<File> list = checkFile(new Scanner(System.in).next());
			System.out.println("一共有"+list.size()+"个java文件");
			int count=0;
			for (int i = 0; i < list.size(); i++) {
				try {
					int sum=0;
					FileReader fr = new FileReader(list.get(i));
					BufferedReader br = new BufferedReader(fr);
					String a;
					while((a=br.readLine())!=null){
						count++;
						sum++;
					}
					System.out.println("该文件是"+list.get(i).getName()+"------有"+sum+"行");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("一共有"+count+"行");
		}
}
