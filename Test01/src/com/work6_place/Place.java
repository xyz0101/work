package com.work6_place;

import java.util.ArrayList;
import java.util.List;

import com.work6_animals.Animals;
import com.work6_listanimal.ListAnimal;
import com.work6_person.Person;

public class Place {
		private int food;

		public int getFood() {
			return food;
		}

		public void setFood(int food) {
			this.food = food;
		}
		List<Animals> list = new ArrayList<Animals>();
		public void allanimals(){
		ListAnimal l=new ListAnimal();
		list=l.allAnimalls();
		}
		public void zhaogu(Person p,Animals a){
			p.zhaogu(a);
		}
		public void start(){
			System.out.println("-------ϵͳ���в˵�------");
			System.out.println("1:���ֶ���");
			System.out.println("2:��������");
			System.out.println("3:��������");
			System.out.println("4:�г����ж���");
			System.out.println("5:���ж��������");
			System.out.println("6:�˳�");
		}
		
}
