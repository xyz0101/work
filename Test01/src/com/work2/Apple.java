package com.work2;
public class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("Æ»¹ûÌğ");
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
		System.out.println("Ïã½¶Ïã");
	}
}
class Orange extends Fruit{
	@Override
	public void eat() {
		System.out.println("éÙ×ÓËá");
	}	
}

