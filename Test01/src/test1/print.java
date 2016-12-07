package test1;

import java.util.Calendar;
import java.util.Date;

public class print {
	 protected void test() {
		System.out.println("test!!");
	}
	 public static void main(String[] args) {
		 	Calendar c = Calendar.getInstance();
		 	c.set(1996, 6, 13);
		 	Date d =c.getTime();
		 	long d0 = new Date().getTime();
		 	long d1 = c.getTimeInMillis();
		 	System.out.println(c.getTimeInMillis());
		 	System.out.println((d0-d1)/1000/60/60/24/365+"   "+c.getTime());
	 
		 	
	 }
}
