package com.work.game;

import java.util.Random;

public class Block {
	/**
	 * type,turn,i
	 */
	int flag=0;
	int type=0,turn=0;
	int type1=0,turn1=0;
	public static final int[] block = new int[16];
	public static final int[][][] shape=new int[][][]{  			

		//I   
			{
	    		{1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
		    	{0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},    		    	
		    	{1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},    			
		    	{0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0}
		    	},    			  	
		    	//J
		    	{
		    	{1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
		        {1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
		        {1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0},
		        {0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0}
		        },    	
		        //L
		        {    		
		        {0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0},
		        {0,0,0,0,1,0,0,0,1,0,0,0,1,1,0,0},
		        {1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0},
		        {1,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0}	    	
		        },
		        //T
		        {
		        {0,1,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
		        {1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0},
    		    {1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0},
        		{0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0}
    		    },
    		    //s
    		    {
    		    {0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0},      		    
    		    {1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0},
        		{0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0},
    		    {1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0}
        		},
        		//Z
        		{
        		{1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
        		{0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0},
           		{1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
           		{0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0}
           		},
           		//o
           		{
           		{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
           		{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
           		{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
           		{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0}
           		}
           		}; 
	public static int[][] wall = new int[18][32];
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
	public void getNextBlock(){
		Random r = new Random();
		if(flag==0){
		type=r.nextInt(7);
		turn=r.nextInt(4);
		type1=r.nextInt(7);
		turn1=r.nextInt(4);
		flag=1;
		}else{
			type=type1;
			turn=turn1;
			type1=r.nextInt(7);
			turn1=r.nextInt(4);
		}
		
		System.out.println(type+"+"+turn);
		
	}
	public int getType(){
		return type;
	}
	public int getTurn(){
		return turn;
	}
	public void outWall(){
		for(int i=0;i<17;i++){
			for(int j=0;j<30;j++)
				System.out.print(wall[i][j]);
			System.out.println();
		}
			
		System.out.println();
	}
}
