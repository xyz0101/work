package com.work2;
public class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("ƻ����");
	}
	public static void main(String[] args) {
			Fruit f = new Apple();
			Fruit f1 = new Banana();
			Fruit f2 = new Orange();
			Fruit[] ff = new Fruit[3];
			ff[0]=f;ff[1]=f1;ff[2]=f2;
			for(Fruit fruit:ff){
				fruit.eat();
		}
	}
}
class Banana extends Fruit{
	@Override
	public void eat() {
		System.out.println("�㽶��");
	}
}
class Orange extends Fruit{
	@Override
	public void eat() {
		System.out.println("������");
	}	
}

