package com.work1;

public class Ji extends Animals{
	private String chibang;
	public Ji(String name, char sex,String chibang) {
		super(name, sex);
		setChibang(chibang);
	}
	public String getChibang() {
		return chibang;
	}
	public void setChibang(String chibang) {
		this.chibang = chibang;
	}
	
	public void ToString() {
		System.out.println("����"+name+",����"+sex+"��"+",����"+getChibang());
	}
	public static void main(String[] args) {
		new Ji("����", 'ĸ', "һ�Խ��ɫ�ĳ��").ToString();
		new Ji("�ݲ�", '��', "һ������ɫ�ĳ��").ToString();
		new Dog1("С��", 'ĸ', "һ�����ɫ��β��").ToString();
		new Dog1("С��", '��', "һ������ɫ��β��").ToString();
	}
}
class Dog1 extends Animals{
	private String weiba;
	public Dog1(String name, char sex,String weiba) {
		super(name, sex);
		setWeiba(weiba);
	}
	public void ToString() {
		System.out.println("����"+name+",����"+sex+"��"+",����"+getWeiba());
	}
	public String getWeiba() {
		return weiba;
	}

	public void setWeiba(String weiba) {
		this.weiba = weiba;
	}
}

