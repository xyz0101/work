package com.work1;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
		public void yao(){
			System.out.println("Ò§ËÀÄã");
		}
		public static void main(String[] args) {
			new Dog("Ğ¡°×", 3).yao();	
		}
}
class Frog extends Animal{

	public Frog(String name, int age) {
		super(name, age);
	}
		public void swim(){
			System.out.println("ÓÎÓ¾");
		}
		public static void main(String[] args) {
			new Frog("ÇàÍÜ", 2).swim();	
		}
}