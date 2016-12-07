package com.work6_factory;

import java.util.Random;

import com.work6_person.Civilian;
import com.work6_person.Farmer;
import com.work6_person.Person;
import com.work6_person.Worker;

public class Factory {
	/**
	 * ��������
	 * @return �������һ���������
	 */
		public static Person newAdopter(){
			Random r = new Random();
			int i =r.nextInt(3);
			switch (i) {
			case 0:
				return new Farmer("����", "farmer", 20);
			case 1:
				return new Worker("����", "worker", 25);
			case 2:
				return new Civilian("����", " civilian", 22);
			default:
				break;
			}
			return null;
		}
}
