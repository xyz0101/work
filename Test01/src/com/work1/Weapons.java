package com.work1;

public class Weapons {
		private int power;
		private int speed;
		public Weapons(int power, int speed) {
			setPower(power);
			setSpeed(speed);
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getPower() {
			return power;
		}
		public void setPower(int power) {
			this.power = power;
		}
}
