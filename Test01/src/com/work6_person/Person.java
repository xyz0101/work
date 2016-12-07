package com.work6_person;

import com.work6_animals.Animals;
import com.work6_rule.Rules;

public abstract class Person implements Rules{
	private String name;
	private String id;
	private int age;
	public abstract void zhaogu(Animals a);
	public Person(String name, String id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Person(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
