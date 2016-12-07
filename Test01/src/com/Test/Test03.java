package com.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("请输入时间");
		Scanner s =new Scanner(System.in);		
		String m=s.next();
	    Calendar c = new GregorianCalendar();
	    DateFormat d1= new SimpleDateFormat("yyyy-MM-dd");
	    Date d = new Date();
		try {
			d = d1.parse(m);
			c.setTime(d);
			c.set(c.DAY_OF_MONTH,1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int year = c.get(Calendar.YEAR);
	    int a[]= new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	   if ( ( (year) % 4 == 0 && (year) % 100 != 0) ||(year) % 400 == 0) 
	        a[1]++;
	   int x=c.get(Calendar.MONTH);
	   int n= a[x];
	   // System.out.println( c.get(Calendar.DAY_OF_WEEK));
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int j=0;j<c.get(Calendar.DAY_OF_WEEK)-1;j++){
			System.out.print("\t");
		}
		for(int i=1;i<=n;i++){
			
			System.out.print(i+"\t");
			if((i+c.get(Calendar.DAY_OF_WEEK)-1)%7==0&&(i+c.get(Calendar.DAY_OF_WEEK)-1)>=7){
				System.out.print("\n");
			}
		}
	}
}
