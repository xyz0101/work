package com.Test;

import java.util.HashMap;
import java.util.LinkedList;

public class TestMap01 {
	int size;
	LinkedList[] arr = new LinkedList[999];
	public void put(Object key, Object value){
		int e = key.hashCode()%arr.length;
		Entry en = new Entry(key, value);
		if(arr[e]==null){
			LinkedList l = new LinkedList();
			arr[e]=l;
			l.add(en);
		arr[e]=l;
		}
		else{
			for(int i=0;i<arr[e].size();i++){
				Entry e1 = (Entry) arr[e].get(i);
				if(e1.value.equals(value)){
					e1.value=value;
				}
			}
		}
		arr[e].add(en);
	}
	public Object get(Object key){
		int e = key.hashCode()%arr.length;
		for(int i=0;i<arr[e].size();i++){
			Entry e1 = (Entry) arr[e].get(i);
			if(e1.key.equals(key)){
				return e1.value;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		TestMap t =new TestMap();
		t.put("张三", new Age(21));
		t.put("李四", new Age(25));
		t.put("李四", new Age(28));
		Age a=  (Age) t.get("张三");
		System.out.println(a.age);
	}
}

