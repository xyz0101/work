package com.work5;

import java.util.Comparator;

public class Compara implements Comparator<Dog>{

		@Override
		public int compare(Dog o1, Dog o2) {
			// TODO Auto-generated method stub
			return new Integer(o2.getAge()).compareTo(new Integer(o1.getAge()));
		}

	
}
