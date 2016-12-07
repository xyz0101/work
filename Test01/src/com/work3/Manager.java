package com.work3;

public class Manager extends Employee {
		public final String vehicle="vehicle1";
	public Manager(String name, char sex, int age, int salary) {
		super(name, sex, age, salary);
		// TODO Auto-generated constructor stub
	}
	public Manager(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role r = new Employee("aaa", 111);
		r.play();
		Role r1 = new Manager("sadasd", 'ÄÐ', 12, 12112);
		r1.play();
		System.out.println(new Manager().vehicle );
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ManagerÍæ");
	}

}
