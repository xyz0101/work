package com.work1;

public class Animal {
		private String name;
		private int age;
		public void eat(){
			System.out.println("��óԣ�");
		}
		public Animal(String name, int age) {
			setAge(age);
			setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
