package com.work2;

public abstract class Teacher {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0&&age<=120)
		this.age = age;
	}
	public abstract void teach();
	public Teacher(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
}
