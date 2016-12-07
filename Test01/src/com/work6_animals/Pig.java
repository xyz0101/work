package com.work6_animals;

public class Pig extends Animals {

	public Pig(String name, int weight, int age, int maxWeght) {
		super(name, weight, age, maxWeght);
		
	}
	public Pig(){
		
	}
	@Override
	public void eat() {
		if(this.getAge()<this.getMaxWeight())
			this.setWeight(getWeight()+5);
			else
				this.setAge(getMaxWeight());
	}
	
	@Override
	public void feature() {
		// TODO Auto-generated method stub
		System.out.println("我是"+getName()+",我很胖");
	}

}
