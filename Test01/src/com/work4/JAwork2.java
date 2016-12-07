package com.work4;

import java.util.Scanner;

public class JAwork2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String age1 = s.nextLine();
		String sex = s.nextLine();
		String weight1 = s.nextLine();
		String isMarray1 = s.nextLine();
		int age = Integer.parseInt(age1);
		float weight = Float.parseFloat(weight1);
		boolean isMarray = Boolean.parseBoolean(isMarray1);
		Person p = new Person(name, age, sex, weight, isMarray);
		System.out.println(p.toString());
	}
}
