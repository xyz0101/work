package com.work1;

public class Bullet extends Weapons {
		private String type;
		public Bullet(int power, int speed,String type) {
		super(power, speed);
		setType(type);
	}

		public void attack(){
			System.out.println("����"+getType()+"�ӵ����ٶ���"+getSpeed()+"��������"+getPower());
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
}
