package com.work1;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
		public void yao(){
			System.out.println("ҧ����");
		}
		public static void main(String[] args) {
			new Dog("С��", 3).yao();	
		}
}
class Frog extends Animal{

	public Frog(String name, int age) {
		super(name, age);
	}
		public void swim(){
			System.out.println("��Ӿ");
		}
		public static void main(String[] args) {
			new Frog("����", 2).swim();	
		}
}