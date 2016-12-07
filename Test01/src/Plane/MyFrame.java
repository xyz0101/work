package Plane;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyFrame extends Frame{
	public void GameFrame(){
		   //Frame f = new Frame();
		   setSize(1100, 600);
		   setLocation(10,10);
		   setVisible(true);
		  new PaintThread().start();
		  
		   addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	   
		   });
		   
	   }
	class PaintThread extends Thread{
		 public void run(){
			 while (true){
				 repaint();
				 try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
	  }
	}
