package com.work5;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestLink {
		public static void main(String[] args) {
			List<String> list = new LinkedList<String>();
			list.add("����");
			list.add("����");
			list.add("�Ű�");
			list.add("����");
			list.add("����");
			list.add("����");
			list.add("����");
			list.add("����");
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).startsWith("��"))
				System.out.println(list.get(i));
			}
			//���ϴ���˳��
			Collections.shuffle(list);
			System.out.println(list);
		}
}
