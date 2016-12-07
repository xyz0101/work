package Test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import Test.Util.Dir;
public class Controller implements KeyListener{
	//��ͷ��list������  
    private int headIndex;  
      
    /** 
     * ̰�����б� 
     */  
    ArrayList<Node> snakeList;  
      
    /**
     * �����б� 
     */  
    ArrayList<Node> foodList;  
    //�Ƿ���Ƴ�������ʾ  
    private boolean isDraw = false;   
    //�²����Ķ���  
    Node newnode;
    //��һ����
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
	
	//�����ƶ�  
    private void moveUp()  
    {  
        if(!isEndGame()){  
            //ÿ�ƶ�һ��  ����ͷ����һ�� list����һ��Ԫ��  
        	snakeList.add(new Node(snakeList.get(headIndex).x, snakeList.get(headIndex).y-1));  
            //����жϳԵ�����  
            if(isEat()){  
                //�Ե����ӵĴ���  
                afterEatApple();  
            }  
            //���� �Ƴ���һ��Ԫ��  
            else {  
            	snakeList.remove(0);  
            }  
            //���»���  
            panel.repaint();  
        }  
    }  
      
    //�����ƶ�  
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
      
    //�����ƶ�  
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
      
    //�����ƶ�  
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
      
      
    //����һ������㵽����ߵ�list ��ӵ�list��ĩβ  
    private void afterEatApple(){  
        //ÿ����һ��  ����ֵ��1 ���¿�ʼ��ϷʱҪ�ظ���ʼֵ  
        headIndex++;  
        foodList.add(new Node(random.nextInt(40), random.nextInt(40)));  
        foodList.remove(0);  
        newnode = foodList.get(0);  
        //System.out.println("������:"+mSnakeTrail.size());  
    }  
      
    //�ж����Ƿ�Ե�����  
    private boolean isEat()  
    {  
        return snakeList.get(snakeList.size()-1).equals(foodList.get(0));  
    }  
      
    //�ж��Ƿ񵽱߽���������Լ�������  
    private boolean isEndGame(){  
        int x = snakeList.get(headIndex).x;  
        int y = snakeList.get(headIndex).y;  
        if(touchBody()||x<0||x>39||y<0||y>39){  
            afterEndGame();  
            return true;  
        }  
        return false;  
    }  
      
    //�����Լ�����  
    private boolean touchBody(){  
        for(int i =0;i<snakeList.size()-1;i++)  
        {  
            if(snakeList.get(headIndex).equals(snakeList.get(i))){  
                return true;  
            }  
        }  
        return false;  
    }  
      
    //��Ϸ��������  
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
