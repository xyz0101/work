package com.work2;

public class JavaTeacher extends Teacher {

	public JavaTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("我叫"+getName()+",我今年"+getAge()+"岁,我教java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new JavaTeacher("张三", 25);
		System.out.println(t.getName()+"  "+t.getAge());
		t.teach();
	}

}
class DBTeacher extends Teacher{
	public DBTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("我叫"+getName()+",我今年"+getAge()+"岁,我教数据库");
	}
}
class NETTeacher extends Teacher{
	public NETTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("我叫"+getName()+",我今年"+getAge()+"岁,我教.NET");
	}
}