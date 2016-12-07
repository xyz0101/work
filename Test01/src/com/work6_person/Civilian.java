package com.work6_person;

import java.util.List;
import java.util.Random;

import com.work6_animals.Animals;
import com.work6_rule.Rules;

public class Civilian extends Person implements Rules{

	public Civilian(String name, String id, int age) {
		super(name, id, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zhaogu(Animals a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Animals adopt(List<Animals> list) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int i=r.nextInt(list.size());
		System.out.println("我叫:"+getName()+"我领养了:"+list.get(i).getName());
		return list.get(i);
	}

	

}
