package com.work.block;

public class Lblock extends Block {
		public Lblock(){
			setMaxindex(4);
			setX(6);
			setY(0);
			int[][] arr = new int[4][4];
			arr[0][0]=arr[1][0]=arr[2][0]=arr[2][1]=1;
			setTurn0(arr);
			arr = new int[4][4];
			arr[1][0]=arr[1][1]=arr[1][2]=arr[0][2]=1;
			setTurn1(arr);
			arr = new int[4][4];
			arr[0][0]=arr[0][1]=arr[1][1]=arr[2][1]=1;
			setTurn2(arr);
			arr = new int[4][4];
			arr[0][0]=arr[1][0]=arr[0][1]=arr[0][2]=1;
			setTurn3(arr);
		}
}
