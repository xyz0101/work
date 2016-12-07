package com.Test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
@SuppressWarnings("serial")
public class MyGame extends Frame{
	Image img = GameUtil.getImage("image/0937.jpg");	
   public void GameFrame(){
	   //Frame f = new Frame();
	   setSize(500, 500);
	   setLocation(100,100);
	   setVisible(true);
	  new PaintThread().start();
	   addWindowListener(new WindowAdapter(){
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}	   
	   });
	   
   }
    private double x=100,y=100;
	private double degree = 3.14/3;
	private double speed = 10;
   @Override
public void paint(Graphics g) {
	   super.paint(g);
	  // System.out.println(111);
	  // g.drawLine(150, 150, 250, 250);
	g.drawImage(img, (int)x, (int)y,30,30,null );
	if(speed>0){
		speed -=0.05;
	}else
		speed = 0;
	x+= speed*Math.cos(degree);
	y+= speed*Math.sin(degree);
	if(y<30||y>500-40){
		degree = -degree;
	}
	if(x<0||x>500-40){
		degree = Math.PI-degree;
	}	
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
public static void main(String[] args) {
	   MyGame game = new MyGame();
	   game.GameFrame();	   
}
}
