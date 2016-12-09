package com.work.block;

public class Iblock extends Block {
		public Iblock(){
			setMaxindex(2);
			setX(6);
			setY(0);
			int[][] arr = new int[4][4];
			arr[0][0]=arr[0][1]=arr[0][2]=arr[0][3]=1;
			setTurn0(arr);
			arr = new int[4][4];
			arr[0][0]=arr[1][0]=arr[2][0]=arr[3][0]=1;
			setTurn1(arr);
		}
}
