package com.work3;

public class Car extends Auto {
		private String KT;
		private String CD;
		public static void main(String[] args) {
			new Car().addSpeed();
		}
		public void addSpeed(){
			System.out.println("С��������");
		}
		public void lowSpeed(){
			System.out.println("С��������");
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
