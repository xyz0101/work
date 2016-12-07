package com.work3;

public class Car extends Auto {
		private String KT;
		private String CD;
		public static void main(String[] args) {
			new Car().addSpeed();
		}
		public void addSpeed(){
			System.out.println("小汽车加速");
		}
		public void lowSpeed(){
			System.out.println("小汽车减速");
		}
		
		public String getKT() {
			return KT;
		}
		public void setKT(String kT) {
			KT = kT;
		}
		public String getCD() {
			return CD;
		}
		public void setCD(String cD) {
			CD = cD;
		}
}
