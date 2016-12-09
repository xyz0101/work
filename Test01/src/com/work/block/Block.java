package com.work.block;

import com.work.conts.Conts;
import com.work.factory.Factory;
import com.work.wall.Wall;

public class Block {
		public int arr[][]= new int[4][4];
		Wall w = new Wall();
		private int[][] turn0= new int[4][4];
		private int[][] turn1= new int[4][4];
		private int[][] turn2= new int[4][4];
		private int[][] turn3= new int[4][4];
		private int index;
		private int maxindex;
		private int x,y;
		public int[][] getTurn0() {
			return turn0;
		}
		public void setTurn0(int[][] turn0) {
			this.turn0 = turn0;
		}
		public int[][] getTurn1() {
			return turn1;
		}
		public void setTurn1(int[][] turn1) {
			this.turn1 = turn1;
		}
		public int[][] getTurn2() {
			return turn2;
		}
		public void setTurn2(int[][] turn2) {
			this.turn2 = turn2;
		}
		public int[][] getTurn3() {
			return turn3;
		}
		public void setTurn3(int[][] turn3) {
			this.turn3 = turn3;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getMaxindex() {
			return maxindex;
		}
		public void setMaxindex(int maxindex) {
			this.maxindex = maxindex;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public void turn(){
			index=(index+1)%maxindex;
		}
		public void down(){
			
			y++;
		}
		public void right(){
			
			x++;
		}
		public void left(){
			
			x--;
		}
		public int[][] getTurn(){
			if(index==0)
			return arr=turn0;
			else
				if(index==1)
					return arr=turn1;
					else
						if(index==2)
							return arr=turn2;
							else
								return arr=turn3;
		}
		public boolean isImpact(int x,int y){
			for (int i = 0; i < arr.length; i++) 
				for(int j=0;j<arr[i].length;j++){
					if(arr[i][j]==1&&w.wall[x+1+j][y+i]==1){
						Factory.getAu("impact").play();
						System.out.println(true);
						return true;
					}
					else if(arr[i][j]==1&&w.wall[x+1+j][y+i]==2){
						System.out.println(true);
						Factory.getAu("impact").play();
						return true;
					}
				}	
			return false;
			}	
		public void addBlock(){
			
			for(int i=0;i<arr.length;i++)
				for(int j=0;j<arr[i].length;j++){
					if(w.wall[x+j+1][y+i]==0){
    					w.wall[x+j+1][y+i]=arr[i][j];
    				}
					;
				}
			}
		}

