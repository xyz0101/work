package com.work2;

public class Zhishengji extends Plane {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("垂直起飞");
	}

}
class Zhandouji extends Plane{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("弹射起飞");
	}
}
class Keji extends Plane{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("滑行起飞");
	}
	
}
