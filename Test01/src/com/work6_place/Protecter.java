package com.work6_place;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.work6_animals.Animals;
import com.work6_animals.Cat;
import com.work6_animals.Dog;
import com.work6_animals.Pig;
import com.work6_person.Person;

public class Protecter extends Person{

	public Protecter(String name, String id, int age) {
		super(name, id, age);
		// TODO Auto-generated constructor stub
	}
	public  Protecter(){
	}
	public Animals discoverAnimal(){
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		int weight;
		int maxWeght;
		Random ran = new Random();
		int i = ran.nextInt(3);
		switch (i+1) {
		case 1:
			System.out.println("发现了一只猫，请输入猫的信息：");
			 name = in.next();
			 age = in.nextInt();
			 weight = in.nextInt();
			 maxWeght = in.nextInt();
			return new Cat(name, weight, age, maxWeght);
			
		case 2:
			System.out.println("发现了一条狗，请输入狗的信息：");
			 name = in.next();
			 age = in.nextInt();
			 weight = in.nextInt();
			 maxWeght = in.nextInt();
			return new Dog(name, weight, age, maxWeght);
			
		case 3:
			System.out.println("发现了一头猪，请输入猪的信息：");
			 name = in.next();
			 age = in.nextInt();
			 weight = in.nextInt();
			 maxWeght = in.nextInt();
			return new Pig(name, weight, age, maxWeght);
			
		
		}
		return null;
	}

	@Override
	public void zhaogu(Animals a) {
		// TODO Auto-generated method stub
		a.eat();
	}
	@Override
	public Animals adopt(List<Animals> list) {
		// TODO Auto-generated method stub
		return null;
	}
}
