package com.work5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestList {
		public static void main(String[] args) {
			List<Dog> list = new ArrayList<Dog>();
			list.add(new Dog("С��", 12));
			list.add(new Dog("С��", 18));
			list.add(new Dog("С��", 16));
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
					"��A","��2","��3","��4","��5","��6","��7","��8","��9","��10","��J","��Q","��K",
					"��A","��2","��3","��4","��5","��6","��7","��8","��9","��10","��J","��Q","��K",
					"÷A","÷2","÷3","÷4","÷5","÷6","÷7","÷8","÷9","÷10","÷J","÷Q","÷K",
					"��A","��2","��3","��4","��5","��6","��7","��8","��9","��10","��J","��Q","��K",
					"����","С��"};
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
			list4.add(new Address("sebrina", "����", "��ɳ��", "����ʡ", "�й�", "410128"));
			list4.add(new Address("wqe", "����", "�Ͼ���", "����ʡ", "�й�", "16545"));
			list4.add(new Address("sebr2312ina", "�Ϻ�", "��̶��", "����ʡ", "�й�", "78974564"));
			System.out.println(list4);
		}
}
