package Test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import Test.Util.Dir;
public class Controller implements KeyListener{
	//蛇头在list中索引  
    private int headIndex;  
      
    /** 
     * 贪吃蛇列表 
     */  
    ArrayList<Node> snakeList;  
      
    /**
     * 豆子列表 
     */  
    ArrayList<Node> foodList;  
    //是否绘制出结束提示  
    private boolean isDraw = false;   
    //新产生的豆子  
    Node newnode;
    //下一方向
    private int mNextDirection;  

	private GamePanel panel;  
	
	private Random random = new Random();  
    public Controller(GamePanel panel){
    	this.panel = panel;
    	snakeList = panel.getSnake().getsnakeList();
    	foodList = panel.getSnake().getfoodList();
    	 mNextDirection = panel.getSnake().getmNextDirection();  
    	 headIndex = snakeList.size()-1;  
         Thread thread = new Thread(runnable);  
         thread.start();  
    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if(isDraw){  
	            return;  
	        }  
	        switch (e.getKeyCode()) {  
	        case KeyEvent.VK_UP:  
	            if(mNextDirection!=Dir.DOWN)  
	            {  
	                mNextDirection = Dir.UP;  
	                //moveUp();  
	            }  
	            break;  
	              
	        case KeyEvent.VK_DOWN:  
	            if(mNextDirection!=Dir.UP)  
	            {  
	                mNextDirection = Dir.DOWN;  
	                //moveDown();  
	            }  
	            break;  
	              
	        case KeyEvent.VK_LEFT:  
	            if(mNextDirection!=Dir.RIGHT)  
	            {  
	                mNextDirection = Dir.LEFT;  
	                //moveLeft();  
	            }  
	            break;  
	              
	        case KeyEvent.VK_RIGHT:  
	            if(mNextDirection!=Dir.LEFT)  
	            {  
	                mNextDirection = Dir.RIGHT;  
	                //moveRight();  
	            }  
	            break;  
	  
	        }  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//向上移动  
    private void moveUp()  
    {  
        if(!isEndGame()){  
            //每移动一次  先在头部加一块 list增加一个元素  
        	snakeList.add(new Node(snakeList.get(headIndex).x, snakeList.get(headIndex).y-1));  
            //如果判断吃到豆子  
            if(isEat()){  
                //吃到豆子的处理  
                afterEatApple();  
            }  
            //否则 移除第一个元素  
            else {  
            	snakeList.remove(0);  
            }  
            //重新绘制  
            panel.repaint();  
        }  
    }  
      
    //向下移动  
    private void moveDown()  
    {  
        if(!isEndGame()){  
        	snakeList.add(new Node(snakeList.get(headIndex).x, snakeList.get(headIndex).y+1));  
            if(isEat()){  
                afterEatApple();  
            }  
            else {  
            	snakeList.remove(0);  
            }  
            panel.repaint();  
        }  
    }  
      
    //向左移动  
    private void moveLeft()  
    {  
        if(!isEndGame()){  
        	snakeList.add(new Node(snakeList.get(headIndex).x-1, snakeList.get(headIndex).y));  
            if(isEat())  
            {  
                afterEatApple();  
            }  
            else {  
            	snakeList.remove(0);  
            }  
            panel.repaint();  
        }  
    }  
      
    //向右移动  
    private void moveRight()  
    {  
        if(!isEndGame()){  
            snakeList.add(new Node(snakeList.get(headIndex).x+1, snakeList.get(headIndex).y));  
            if(isEat())  
            {  
                afterEatApple();  
            }  
            else {  
            	snakeList.remove(0);  
            }  
            panel.repaint();  
        }  
    }  
      
      
    //增加一个坐标点到存放蛇的list 添加到list的末尾  
    private void afterEatApple(){  
        //每增加一个  索引值加1 重新开始游戏时要回复初始值  
        headIndex++;  
        foodList.add(new Node(random.nextInt(40), random.nextInt(40)));  
        foodList.remove(0);  
        newnode = foodList.get(0);  
        //System.out.println("蛇身长度:"+mSnakeTrail.size());  
    }  
      
    //判断蛇是否吃到豆子  
    private boolean isEat()  
    {  
        return snakeList.get(snakeList.size()-1).equals(foodList.get(0));  
    }  
      
    //判断是否到边界或者碰到自己的身体  
    private boolean isEndGame(){  
        int x = snakeList.get(headIndex).x;  
        int y = snakeList.get(headIndex).y;  
        if(touchBody()||x<0||x>39||y<0||y>39){  
            afterEndGame();  
            return true;  
        }  
        return false;  
    }  
      
    //碰到自己身体  
    private boolean touchBody(){  
        for(int i =0;i<snakeList.size()-1;i++)  
        {  
            if(snakeList.get(headIndex).equals(snakeList.get(i))){  
                return true;  
            }  
        }  
        return false;  
    }  
      
    //游戏结束处理  
    private void afterEndGame()  
    {  
        snakeList.remove(headIndex);  
        panel.getSnake().setEnd(true);  
        panel.repaint();  
        this.isDraw = true;  
    }  
      
    Runnable runnable = new Runnable() {  
        public void run() {  
            moveRight();  
            while(!isEndGame())  
            {  
                if(mNextDirection==Dir.UP) moveUp();  
                else if(mNextDirection==Dir.DOWN) moveDown();  
                else if(mNextDirection==Dir.LEFT) moveLeft();  
                else if(mNextDirection==Dir.RIGHT) moveRight();  
                  
                try {  
                    Thread.sleep(200);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
          
    };  	
}
