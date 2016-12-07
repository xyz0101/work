package com.work6_animals;

public class Cat extends Animals{
		
	public Cat(String name, int weight, int age, int maxWeght) {
		super(name, weight, age, maxWeght);
		
		// TODO Auto-generated constructor stub
	}
	public Cat(){
		
	}
	@Override
	public void eat() {
		if(this.getAge()<this.getMaxWeight())
			this.setWeight(getWeight()+1);
			else
				this.setAge(getMaxWeight());
	}

	@Override
	public void feature() {
		// TODO Auto-generated method stub
		System.out.println("我是"+getName()+",我会抓老鼠");
	}
		
}
