package com.work4;

public class Person {
		private String name;
		private int age;
		private String sex;
		private float weight;
		private boolean isMarray;
		
		@Override
		public String toString() {
			return "PersonManager [name=" + name + ", age=" + age + ", sex=" + sex
					+ ", weight=" + weight + ", isMarray=" + isMarray + "]";
		}
		public Person(String name, int age, String sex, float weight,
				boolean isMarray) {
			super();
			setName(name); 	
			setAge(age);
			setMarray(isMarray);
			setSex(sex);
			setWeight(weight);
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
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public boolean isMarray() {
			return isMarray;
		}
		public void setMarray(boolean isMarray) {
			this.isMarray = isMarray;
		}
}
