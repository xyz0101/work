package com.work.block;

public class Oblock extends Block {
		public Oblock(){
			setMaxindex(1);
			setX(6);
			setY(0);
			int[][] arr = new int[4][4];
			arr[0][0]=arr[1][1]=arr[0][1]=arr[1][0]=1;
			setTurn0(arr);
		
		}
}
