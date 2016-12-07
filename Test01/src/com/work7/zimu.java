package com.work7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class zimu {
	public static void main(String[] args) {
		Random r = new Random();

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(r.nextInt(26) + (int) 'a');
		}
		Collections.sort(list);
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		System.out.println(list);
		System.out.println(set);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int num = 0;
		for (Integer i : set) {
			list1.add(i);
		}
		for (int i = 0; i < list1.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).equals(list1.get(i))) {
					count++;
				}
			}
			System.out.println((char) list1.get(i).intValue() + "----" + count);
		}
	}
}
