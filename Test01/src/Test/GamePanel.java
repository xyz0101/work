package Test;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;



public class GamePanel extends JPanel{
	  private static final long serialVersionUID = 1L;  
      
	    //panel的宽度  
	    private static final int width = 400;  
	      
	    //panel的高度  
	    private static final int height = 400;  
	      
	    //坐标点x  
	    private static final int x = 10;  
	      
	    //坐标点y  
	    private static final int y = 10;  
	      
	    //方块尺寸  
	    private static final int SIZE = 10;  
	      
	    //是否开启网格  
	    private boolean isOpen = false;  
	      
	    private Snake snake;  
	      
	    //开启作弊  
	    private JButton girdButton;  
	      
	    private JButton aboutButton;  
	      
	    //暂停 继续按钮  
	    private JButton PauseButton;  
	      
	    //重新开始游戏  
	    private JButton StartButton;  
	      
	    public Snake getSnake() {  
	        return snake;  
	    }  
	      
	    private ArrayList<Node> snakelist = null;  
	      
	    private ArrayList<Node> foodlist = null;  
	      
	    public GamePanel() {  
	        snake  = new Snake();  
	        this.setLayout(null);  
	        StartButton = new JButton("重新开始");  
	        StartButton.setLocation(420,100);  
	        StartButton.setSize(90,26);  
	        this.add(StartButton);  
	        PauseButton = new JButton("暂停游戏");  
	        PauseButton.setLocation(420, 150);  
	        PauseButton.setSize(90,26);  
	        this.add(PauseButton);  
	        girdButton = new JButton("开启网格");  
	        girdButton.setLocation(420, 200);  
	        girdButton.setSize(90,26);  
	        this.add(girdButton);  
	        aboutButton = new JButton("关于游戏");  
	        aboutButton.setLocation(420, 250);  
	        aboutButton.setSize(90,26);  
	        this.add(aboutButton);  
	        girdButton.addActionListener(new GirdActionListener());  
	        aboutButton.addActionListener(new AboutActionListerner());  
	    }  
	  
	    class GirdActionListener implements ActionListener{  
	        int i = 1;  
	        public void actionPerformed(ActionEvent e) {  
	            if(i%2==1)  
	            {  
	                girdButton.setText("关闭网格");  
	                isOpen = false;  
	                i++;  
	            }  
	            else if(i%2==0){  
	                girdButton.setText("开启网格");  
	                isOpen = true;  
	                i++;  
	            }  
	        }  
	          
	    }  
	      
	    class AboutActionListerner implements ActionListener{  
	  
	        public void actionPerformed(ActionEvent e) {  
	              
	        }  
	          
	    }  
	      
	    @Override  
	    public void paintComponent(Graphics g) {  
	        super.paintComponent(g);  
	        creatGameWindow(g);  
	        if(snake.isEnd())  
	        {  
	            paintWords(g);  
	        }  
	        //将焦点定在Jpanel上  
	        this.requestFocus();  
	    }  
	 /** 
     * 安装玩家控制器 
     * @param control 
     */  
    public void setGameControl(Controller controller){  
        this.addKeyListener(controller);  
    }  
  
	 private void creatGameWindow(Graphics g) {  
	        g.setColor(Color.BLACK);  
	        g.drawRect(x, y, width, height);  
	        g.setColor(Color.WHITE);  
	        g.fillRect(x+1, y+1, width-1, height-1);  
	        g.setColor(Color.GRAY);  
 
	        snakelist = snake.getsnakeList();  
	        foodlist = snake.getfoodList();  
	        if(snakelist==null)   
	        {  
	            return;  
	        }  
	        g.setColor(Color.BLACK);  
	        for(int i=0;i<snakelist.size();i++){  
	            g.fillRect(this.x+snakelist.get(i).x*SIZE, this.y+snakelist.get(i).y*SIZE, Snake.TILE_W, Snake.TILE_H);  
	        }  
	          
	        //画豆子  
	        g.setColor(Color.red); 
	        g.fillRect(this.x+foodlist.get(0).x*SIZE, this.y+foodlist.get(0).y*SIZE, Snake.TILE_W, Snake.TILE_H);  
	    }  
	 private  void paintWords(Graphics g){  
	        Font font = new Font("宋体", Font.BOLD, 64);  
	        g.setFont(font);  
	        g.setColor(Color.RED);  
	        g.drawString("游戏结束",60,220);  
	    }  
}
