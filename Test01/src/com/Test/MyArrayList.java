package com.Test;

import javax.lang.model.element.Element;

public class MyArrayList {
	private Object[] ElementDate;
	/*public int size(){
		return size();
	}*/
	private int size=0;
	public MyArrayList(){
		this(10);
	}
	public MyArrayList( int initialcapacity ){
		if(initialcapacity<0){//判断初始值是否小于0
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ElementDate = new Object[initialcapacity]; //创建数组
	}
	public void add(Object obj){
		//数组扩容
		if(size==ElementDate.length){
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(ElementDate, 0, newArray, 0, ElementDate.length);		
			ElementDate = newArray;
		}		
		ElementDate[size++]=obj;
	}
	public boolean isEmpty(int size){
		return size==0;
	}
	public Object get(int index){
		if(index>=size)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return ElementDate[index];
	}
	public void  set(int index ,Object newobj){
		if(index>=size)
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 ElementDate[index] = newobj;
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(23);
		list.add(152);
		list.add(121);
		list.add("qweq");
		list.add(2);
		list.set(0, 2323);
		System.out.println(list.get(0));
	}
}
