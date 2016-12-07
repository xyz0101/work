package com.work2;

public class Daoshi extends Role {

	@Override
	public void attact() {
		// TODO Auto-generated method stub
		System.out.println("Áé»ê»ð·û");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role r = new Daoshi();
		Role r1 = new Daoshi().new Fashi();
		Role r2 = new Daoshi().new Wushi();
		r.attact();
		r1.attact();
		r2.attact();
		
	}
	class Fashi extends Role{

		@Override
		public void attact() {
			// TODO Auto-generated method stub
			System.out.println("À×µçÊõ");
		}
		
	}
	class Wushi extends Role{

		@Override
		public void attact() {
			// TODO Auto-generated method stub
			System.out.println("ÁÒ»ðÊõ");
		}
		
	}
}
