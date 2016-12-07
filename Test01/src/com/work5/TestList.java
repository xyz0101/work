package com.work5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestList {
		public static void main(String[] args) {
			List<Dog> list = new ArrayList<Dog>();
			list.add(new Dog("小白", 12));
			list.add(new Dog("小灰", 18));
			list.add(new Dog("小黑", 16));
			Iterator<Dog> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			for (Dog dog : list) {
				System.out.println(dog);
			}
			List< Integer> list1 = new ArrayList<Integer>();
			list1.add(2);
			list1.add(45);
			list1.add(9);
			list1.add(3);
			list1.add(7);
			list1.add(1);
			Collections.sort(list1);
			for (int i : list1) {
				System.out.println(i);
			}
			Collections.sort(list, new Compara());
			for (Dog dog : list) {
				System.out.println(dog);
			}
			String[] str = new String[]{
					"黑A","黑2","黑3","黑4","黑5","黑6","黑7","黑8","黑9","黑10","黑J","黑Q","黑K",
					"红A","红2","红3","红4","红5","红6","红7","红8","红9","红10","红J","红Q","红K",
					"梅A","梅2","梅3","梅4","梅5","梅6","梅7","梅8","梅9","梅10","梅J","梅Q","梅K",
					"方A","方2","方3","方4","方5","方6","方7","方8","方9","方10","方J","方Q","方K",
					"大王","小王"};
			List<String> list2 = new ArrayList<String>();
			List<String> list3 = new ArrayList<String>();
			for (int i = 0; i < str.length; i++) {
				list2.add(str[i]);
			}
			Collections.shuffle(list2);
			for (int i = 0; i < 13; i++) {
				list3.add(list2.remove(i));
			}
			for (String str1 : list3) {
				System.out.println(str1);
			}
			List<Address> list4 = new ArrayList<Address>();
			list4.add(new Address("sebrina", "东湖", "长沙市", "湖南省", "中国", "410128"));
			list4.add(new Address("wqe", "西湖", "南京市", "湖南省", "中国", "16545"));
			list4.add(new Address("sebr2312ina", "南湖", "湘潭市", "湖南省", "中国", "78974564"));
			System.out.println(list4);
		}
}
