package com.work3;

public class Adoor extends Door implements Door1 {

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("OPEN!!");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
			System.out.println("CLOSE!!");
	}

	@Override
	public void theftproof() {
		// TODO Auto-generated method stub
		System.out.println("THEFT!!");
	}

	@Override
	public void waterproof() {
		// TODO Auto-generated method stub
			System.out.println("WATER!!");
	}

	@Override
	public void bulletproof() {
		// TODO Auto-generated method stub
			System.out.println("BLUUET");
	}
	public static void main(String[] args) {
		new Adoor().openDoor();
	}
}
