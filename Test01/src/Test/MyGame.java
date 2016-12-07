package Test;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class MyGame extends JFrame{
	 private static final long serialVersionUID = 1L;  
	    //���  
	    private static final int width = 530;  
	      
	    //�߶�  
	    private static final int height = 450;  
	      
	    //�߶�ƫ����  
	    private static final int offset = 15;  
	  
	    public MyGame(){  
	        init();  
	    }  
	      
	    /** 
	     * ��ʼ����Ϸ���� 
	     */  
	    private void init()  
	    {  
	        this.setTitle("Java��̰����_1.0");  
	        //frame�ĸ߶� ���  
	        this.setSize(width, height);  
	        //���ھ�����ʾ  
	        Toolkit toolkit = Toolkit.getDefaultToolkit();  
	        Dimension screen = toolkit.getScreenSize();  
	        int w = screen.width;  
	        int h = screen.height;  
	        //�������Ͻ�������x yֵ  
	        this.setLocation((w-this.getWidth())/2, (h-this.getHeight())/2-offset);  
	        //����Ĭ�ϹرյĲ���  
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	        //���ô��ڴ�С���ɸı�  
	        this.setResizable(false);  
	        //���ÿɼ���  
	        this.setVisible(true);  
	          
	        this.setLayout(null);  
	    }  

}
