package com.work7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileStream {
		public static void main(String[] args) {
			File file = new File("Tfile/1.txt");	
			byte[] b = null ;
			System.out.println(file.getAbsolutePath());
			try {
				if(!file.exists())
					try {
						file.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				FileOutputStream fos = new FileOutputStream(file);
				try {
					String shi="   静夜思\n     李白 \n床前明月光，\n疑似地上光；\n举头望明月，\n低头思故乡。\nOh Yh Come On！！！！！";
					byte[] b1 = shi.getBytes();
					fos.write(b1);
					//fos.write(new byte[]{'H','e','l','l','o','\n','W','o','r','l','d'});
					//fos.write(new byte[]{'o','k','!','!','!'});
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				b= new byte[(int) file.length()];
				fis.read(b);
				System.out.println(new String(b));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File file1 = new File("Tfile/2.txt");
			try {
				file1.createNewFile();
				FileOutputStream fos1 = new FileOutputStream(file1);
				fos1.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			byte[] b1 ;
			File file2 = new File("C:\\Users\\Administrator\\Pictures\\Camera Roll\\9.jpg");
			File file3 = new File("C:\\Users\\Administrator\\Pictures\\Camera Roll\\2.jpg");
			
			b1=new byte[(int) file2.length()];	
			try {
					FileInputStream fis2 = new FileInputStream(file2);
					try {
						fis2.read(b1);
						if(!file3.exists())
							file3.createNewFile();
						FileOutputStream fos2 = new FileOutputStream(file3);
						fos2.write(b1);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
}
