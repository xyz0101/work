package com.Test;

public class TestMap {
	int size;
	Entry[] arr = new Entry[1000];
	public void put(Object key,Object value){
		Entry e = new Entry(key, value);
		//�����ֵ�ظ�
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				arr[i].value=value;
				return;
			}
		}
		arr[size++]= e;
	}
	public Object get(Object key) {
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		TestMap t =new TestMap();
		t.put("����", new Age(21));
		t.put("����", new Age(25));
		t.put("����", new Age(28));
		Age a=  (Age) t.get("����");
		System.out.println(a.age);
	}
	
}
class Entry{
	Object key;
	Object value;
	
	public Entry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	}