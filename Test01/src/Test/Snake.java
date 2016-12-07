package Test;

import java.util.ArrayList;
import Test.Util.Dir;
public class Snake {
	 //小方块x坐标  
    private int x;  
      
    //小方块y坐标  
    private int y;  
      
    //宽度  
    public static final int TILE_W = 10;  
      
    //高度  
    public static final int TILE_H = 10;  
      
    //下一个方向  
    private int mNextDirection = Dir.RIGHT;  
  
    //游戏是否结束  
    private boolean isEnd;   
      
    //存放贪吃蛇  
    private ArrayList<Node> snakelist = new ArrayList<Node>();  
      
    //存放豆子  
    private ArrayList<Node> foodlist = new ArrayList<Node>();  
  
    public Snake()  
    {  
        initNewGame();  
    }  
      
    //初始化新游戏  
    public void initNewGame()  
    {  
        //初始化蛇身  
        snakelist.add(new Node(5, 7));  
        snakelist.add(new Node(6, 7));
        snakelist.add(new Node(7, 7));
        snakelist.add(new Node(8, 7));
        snakelist.add(new Node(9, 7));
        snakelist.add(new Node(10, 7));
       
        //初始化豆子  
        foodlist.add(new Node(20,20));  
          
        //设置初始状态为false  
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
