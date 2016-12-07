package com.work3;

public class Car1 extends Vehicle1 {

	@Override
	public String numOfWheels() {
		// TODO Auto-generated method stub
		return "四轮车";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v = new Car1();
		Vehicle1 v1 = new Motorbike();
			System.out.println(v.numOfWheels());
			System.out.println(v1.numOfWheels());
	}

}
class Motorbike extends Vehicle1 {

	@Override
	public String numOfWheels() {
		// TODO Auto-generated method stub
		return "两轮车";
	}
	
}