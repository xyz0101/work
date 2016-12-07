package com.Test;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
		//List list =  new LinkedList();	
	private Node first;	
	private Node last;
			public MyLinkedList(){
				
			}
			public void remove( int index){
				Node n = new Node();
				n=first;
				Node a,b;
				if(first!=null){
				for(int i=0;i<index;i++){
					n=n.next;
				}
				}		
				a=n.next;
				b=n.up;
				n.up.setNext(a);
				n.next.setUp(b);				
			}
			public void add(Object obj){
				Node n = new Node();
				if(first==null){					
					n.setUp(null);
					n.setObj(obj);
					n.setNext(null);
					first = n;
					last = n;
				}else{
					n.setUp(last);
					n.setObj(obj);
					n.setNext(null);
					last.setNext(n);
					last = n;
					
				}
			}
			public void add(int index,Object obj){
				Node n = null;
				Node a=new Node();
				if(first==null){
				n.setUp(null);
				n.setObj(obj);
				n.setNext(null);
				first = n;
				last = n;
				}
				if(first!=null){
					n = first;
					for(int i=0;i<index-1;i++){
					n = n.next;
					}
					a.up=n;
					n.next.up=a;
					a.next=n.next;
					n.next=a;
					a.obj=obj;
					
				}
			}
					public Object get(int index){
						Node temp = null;
						if(first!=null){
							temp = first;
							for(int i=0;i<index;i++){
							temp = temp.next;
							}
						}
						return temp.obj;
					}
			public static void main(String[] args) {
				MyLinkedList link = new MyLinkedList();
				link.add(111);
				link.add(222);
				link.add(333);
				link.add(444);
				//link.remove(2);
				link.add(3, 151);
				System.out.println(link.get(4));
			}
}
