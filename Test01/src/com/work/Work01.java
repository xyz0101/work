package com.work;

import java.util.Random;

public class Work01 {
		public static void main(String[] args) {
			Random ran = new Random();
			int num = ran.nextInt(3);
			switch (num) {
			case 0:
				Student stu = new Student("张三", '男', 18,1.75,12);
				stu.ShowData();
				break;
			case 1:
				Teacher tea = new Teacher("张老师", '男', 28,1.78,5000);
				tea.ShowData();
				break;
			case 2:
				Admin admin = new Admin("张网管", '男', 25,1.70);
				admin.ShowData();
				break;
			default:
				break;
			}	
		}
}
