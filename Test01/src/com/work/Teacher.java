package com.work;

public class Teacher extends Person{
		private int salary;
	public Teacher(String name, char sex, int age,double height,int salary) {
		super(name, sex, age,height);
		setSalary(salary);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void ShowData(){
		System.out.println("����"+getName()+",����"+getAge()+"��,�����"+getHeight()+",нˮ��"+getSalary()+"!!!");
	}
}
