package com.Test;

import java.util.ArrayList;

public class Test {
	
	/**
	 * Ä£ÄâArrayList
	 * 
	 */
	int size;
	Object vaule[];
	public  Test() {
		//vaule = new Object[16];
		this(16);
	}
	public Test  (int size ) {
		vaule = new Object[size];
	}
	public void add(Object obj){
		vaule [size]= obj;
		size ++;
		if(size>=vaule.length){
			int newVaule= vaule.length*2;
			Object[] newList = new Object[newVaule];
			for (int i=0;i<size;i++){
				newList[i]=vaule[i];
			}
		}
	}
	public Object get( int index) {
		if(index<0||index>size-1){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return vaule[index];
	}
  public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("qwewqeweqweqwewqew");
	sb.replace(2, 3, "a");
	sb.reverse();
	System.out.println(sb);
	Test t= new Test();
	t.add(new Name("mingzi"));
	Name n = (Name)t.get(0);
	//String a = t.get(0);
	System.out.println(n.getName());
	ArrayList<Object> a = new ArrayList<Object>();
	a.add(new Name(20));
	
	Name n1 = (Name)a.get(0);
	System.out.println(n1.getAge());
}
}
