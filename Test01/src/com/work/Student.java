package com.work;

public class Student extends Person{
		private int grade;
		public Student(String name, char sex, int age,double height,int grade) {
			super(name, sex, age,height);
			setGrade(grade);
		}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void ShowData(){
		System.out.println("����"+getName()+",����"+getAge()+"��,�����"+getHeight()+",�꼶��"+getGrade()+"!!!");
	}
}
