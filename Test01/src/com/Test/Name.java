package com.Test;

public class Name {
private String name ;
private int age ;
public Name (String name) {
	super();
	this.name= name;
}
public Name (int  age) {
	super();
	this.age= age;
}

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
	this.age = age;
}

}
