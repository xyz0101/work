package com.work3;

public  class Employee extends Role {
		private int salary;
	public Employee(String name, char sex, int age,int salary) {
		super(name, sex, age);
		setSalary(salary);
		// TODO Auto-generated constructor stub
	}
	public Employee(String name,int salary){
		setName(name);
		setSalary(salary);
	}
	public Employee(){
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("employee!!!");
	}

}
