package com.work3;

public abstract class Role {
	private String name;
	private char sex;
	private int age;
	
	
	public Role(String name, char sex, int age) {
		super();
		setAge(age);
		setName(name);
		setSex(sex);
	}
	public Role(String name,  int age) {
		super();
		setAge(age);
		setName(name);
	}
	public Role(){
		super();
	}
	public abstract void play();
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
		if(sex=='ÄĞ'||sex=='Å®')
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0&&age<=120)
		this.age = age;
	}
	
}
