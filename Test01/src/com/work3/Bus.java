package com.work3;

public class Bus implements Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Bus().start(1);
			new Bus().stop(1);
			new Bike().start(2);
			new Bike().stop(2);
	}

	@Override
	public void start(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+"  Æô¶¯");
	}

	@Override
	public void stop(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+"  Í£Ö¹");
	}

}
class Bike implements Vehicle{

	@Override
	public void start(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+"  Æô¶¯");
	}

	@Override
	public void stop(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+"  Í£Ö¹");
	}
	
}
