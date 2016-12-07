package Test;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class MyGame extends JFrame{
	 private static final long serialVersionUID = 1L;  
	    //宽度  
	    private static final int width = 530;  
	      
	    //高度  
	    private static final int height = 450;  
	      
	    //高度偏移量  
	    private static final int offset = 15;  
	  
	    public MyGame(){  
	        init();  
	    }  
	      
	    /** 
	     * 初始化游戏界面 
	     */  
	    private void init()  
	    {  
	        this.setTitle("Java版贪吃蛇_1.0");  
	        //frame的高度 宽度  
	        this.setSize(width, height);  
	        //窗口居中显示  
	        Toolkit toolkit = Toolkit.getDefaultToolkit();  
	        Dimension screen = toolkit.getScreenSize();  
	        int w = screen.width;  
	        int h = screen.height;  
	        //计算左上角坐标点的x y值  
	        this.setLocation((w-this.getWidth())/2, (h-this.getHeight())/2-offset);  
	        //设置默认关闭的操作  
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	        //设置窗口大小不可改变  
	        this.setResizable(false);  
	        //设置可见性  
	        this.setVisible(true);  
	          
	        this.setLayout(null);  
	    }  

}
