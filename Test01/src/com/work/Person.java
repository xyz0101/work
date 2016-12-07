package com.work;

public class Person {
		private String name;
		private char sex;
		private double height;
		public Person(String name, char sex, int age,double hight) {
			setAge(age);
			setName(name);
			setSex(sex);
			setHeight(hight);		
		}
		private int  age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getSex() {
			return sex;
		}
		public void setSex(char sex) {
			if(sex=='男'||sex=='女')
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age>=0&&age<=120)
			this.age = age;
		}
		public void ShowData(){
			System.out.println("我是"+name+",今年"+age+"岁,性别是"+sex+"!!!");
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
}
