package com.work1;

public class Test {
		public static void main(String[] args) {
			Tank t =new Tank(500, 20, '��');
			t.attack();
			Bullet b = new Bullet(200, 1000, "��ǹ");
			b.attack();
		}
}
