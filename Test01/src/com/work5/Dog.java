package com.work5;

public class Dog {
  private String name;
  private int age;
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Dog [name=" + name + ", age=" + age + "]";
}
public Dog(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
