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
			System.out.println("-------系统运行菜单------");
			System.out.println("1:发现动物");
			System.out.println("2:饲养动物");
			System.out.println("3:动物招领");
			System.out.println("4:列出所有动物");
			System.out.println("5:所有动物的特征");
			System.out.println("6:退出");
		}
		
}
