package com.work6_animals;

public abstract class Animals {
		private String name;
		private int weight;
		private int age;
		private int maxWeight;
		public abstract void feature();
		public abstract void eat();
		
		@Override
		public String toString() {
			return "Animals [name=" + name + ", weight=" + weight + ", age="
					+ age + "]";
		}
		public Animals(){
			
		}
		public Animals(String name, int weight, int age,int maxWeght) {
			super();
			this.maxWeight=maxWeght;
			this.name = name;
			this.weight = weight;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			if(this.weight<maxWeight)
			this.weight = weight;
			else
				this.weight = maxWeight;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getMaxWeight() {
			return maxWeight;
		}
		public void setMaxWeight(int maxWeight) {
			this.maxWeight = maxWeight;
		}
	
}
