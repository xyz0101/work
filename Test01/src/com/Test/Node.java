package com.Test;

public class Node {
	Node up;
	Object obj;
	Node next;
	public  Node() {
		
	}
	public Node(Node up, Object obj, Node next) {
		super();
		this.up = up;
		this.obj = obj;
		this.next = next;
	}
	public Node getUp() {
		return up;
	}
	public void setUp(Node up) {
		this.up = up;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
