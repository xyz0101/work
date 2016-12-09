package com.work.wall;

public class Wall {
	public static int[][] wall = new int[18][32];
	public Wall(){
		initWall();
	}
	public void initWall(){
		for(int i=0;i<17;i++){		
		wall[i][29]=2;
		}
		for(int j=0;j<30;j++){
		wall[0][j]=2;
		wall[16][j]=2;
		}
	}
	public void firstWall(){
		for(int i=1;i<16;i++)
			for(int j=0;j<29;j++)
				wall[i][j]=0;
		
	}
}
