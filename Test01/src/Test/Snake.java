package Test;

import java.util.ArrayList;
import Test.Util.Dir;
public class Snake {
	 //С����x����  
    private int x;  
      
    //С����y����  
    private int y;  
      
    //���  
    public static final int TILE_W = 10;  
      
    //�߶�  
    public static final int TILE_H = 10;  
      
    //��һ������  
    private int mNextDirection = Dir.RIGHT;  
  
    //��Ϸ�Ƿ����  
    private boolean isEnd;   
      
    //���̰����  
    private ArrayList<Node> snakelist = new ArrayList<Node>();  
      
    //��Ŷ���  
    private ArrayList<Node> foodlist = new ArrayList<Node>();  
  
    public Snake()  
    {  
        initNewGame();  
    }  
      
    //��ʼ������Ϸ  
    public void initNewGame()  
    {  
        //��ʼ������  
        snakelist.add(new Node(5, 7));  
        snakelist.add(new Node(6, 7));
        snakelist.add(new Node(7, 7));
        snakelist.add(new Node(8, 7));
        snakelist.add(new Node(9, 7));
        snakelist.add(new Node(10, 7));
       
        //��ʼ������  
        foodlist.add(new Node(20,20));  
          
        //���ó�ʼ״̬Ϊfalse  
        isEnd = false;  
    }  
  
    public ArrayList<Node> getsnakeList() {  
        return snakelist;
    }  
      
    public ArrayList<Node> getfoodList() {  
        return foodlist;  
    }  
      
      
    public boolean isEnd() {  
        return isEnd;  
    }  
  
    public int getmNextDirection() {  
        return mNextDirection;  
    }  
  
    public void setEnd(boolean isEnd) {  
        this.isEnd = isEnd;  
    }  
      
      
}  
