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
		System.out.println("我是"+name+",我是"+sex+"鸡"+",我有"+getChibang());
	}
	public static void main(String[] args) {
		new Ji("花花", '母', "一对金黄色的翅膀").ToString();
		new Ji("草草", '公', "一对银黄色的翅膀").ToString();
		new Dog1("小白", '母', "一条金白色的尾巴").ToString();
		new Dog1("小黄", '公', "一条银白色的尾巴").ToString();
	}
}
class Dog1 extends Animals{
	private String weiba;
	public Dog1(String name, char sex,String weiba) {
		super(name, sex);
		setWeiba(weiba);
	}
	public void ToString() {
		System.out.println("我是"+name+",我是"+sex+"狗"+",我有"+getWeiba());
	}
	public String getWeiba() {
		return weiba;
	}

	public void setWeiba(String weiba) {
		this.weiba = weiba;
	}
}

