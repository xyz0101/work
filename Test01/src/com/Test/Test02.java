package com.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		DateFormat d1=new SimpleDateFormat("yyyy-MM-dd");
		Date d= new Date();
		d.setTime(1234567890);
		d.getTime();
		//System.out.println(d);
		String str = d1.format(d);
		String str1 =  "2016-5-4";
		try {
			Date d2=d1.parse(str1);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(str);
	}
}
