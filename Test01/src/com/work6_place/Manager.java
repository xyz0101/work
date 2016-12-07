package com.work6_place;

import java.util.List;

import com.work6_animals.Animals;
import com.work6_person.Person;

public class Manager extends Person{

	public Manager(String name, String id, int age) {
		super(name, id, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zhaogu(Animals a) {
		// TODO Auto-generated method stub
		a.eat();
	}

	@Override
	public Animals adopt(List<Animals> list) {
		// TODO Auto-generated method stub
		return null;
	}
		
}
