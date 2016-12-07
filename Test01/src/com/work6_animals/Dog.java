package com.work6_animals;

public class Dog extends Animals {

	public Dog(String name, int weight, int age, int maxWeght) {
		super(name, weight, age, maxWeght);
	}
	public Dog(){
		
	}
	@Override
	public void eat() {
		if(this.getAge()<this.getMaxWeight())
			this.setWeight(getWeight()+2);
			else
				this.setAge(getMaxWeight());
	}
	@Override
	public void feature() {
		// TODO Auto-generated method stub
		System.out.println("我是"+getName()+",我会看家");
	}

}
