package com.work1;

public class Tank extends Weapons{
	private char dir;
		public Tank(int power, int speed,char dir) {
		super(power, speed);
		setDir(dir);
		// TODO Auto-generated constructor stub
	}
		public char getDir() {
			return dir;
		}
		public void setDir(char dir) {
			this.dir = dir;
		}
		public void attack(){
			System.out.println("����̹�ˣ���"+getDir()+"���˶����ٶ���"+getSpeed()+"��������"+getPower());
		}
}
