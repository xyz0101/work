package com.work2;

public class Airport {

	public void startFly(Plane plane){
		plane.fly();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p = new Zhandouji();
		new Airport().startFly(p);
	}

}
