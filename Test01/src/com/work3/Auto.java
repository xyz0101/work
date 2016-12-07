package com.work3;

public  class Auto {
		private int num;
		private String color;
		private String weight;
		private int speed;
		
		public Auto(int num, String color, String weight, int speed) {
			super();
			setColor(color);
			setNum(num);
			setSpeed(speed);
			setWeight(weight);
		}
		public Auto(){
			
		}
		public void addSpeed(){
			System.out.println("º”ÀŸ");
		}
		public void lowSpeed(){
			System.out.println("ºıÀŸ");
		}
		public void stop(){
			System.out.println("Õ£÷π");
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
}
