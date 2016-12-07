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
			list.add("张三");
			list.add("李四");
			list.add("张吧");
			list.add("王五");
			list.add("赵六");
			list.add("李老");
			list.add("李翔");
			list.add("黑子");
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).startsWith("李"))
				System.out.println(list.get(i));
			}
			//集合打乱顺序
			Collections.shuffle(list);
			System.out.println(list);
		}
}
