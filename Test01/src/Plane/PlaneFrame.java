package Plane;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;

import PlayMusic.music;
import PlayMusic.music1;



@SuppressWarnings("serial")
public class PlaneFrame extends MyFrame{
	Date start,over;
		Image image =GameUtil.getImage("img1/bg.jpg");
		int x=0;
		ArrayList<ZiDan> zidanList = new ArrayList<ZiDan>();
		Plane p = new Plane("img1/player.png");
		public void GameFrame(){
			start = new Date();
			 setSize(400, 600);
			setLocation(10,10);
			//Éú³É×Óµ¯
			music m = new music();
			m.a("music/bgm.wav");
		
			
				new PaintThread().start();
			
			
			for (int i = 0; i < 10; i++) {
				ZiDan z =new ZiDan();
				zidanList.add(z);
			}
			   setVisible(true);		   
			   addKeyListener(new KeyMoniter());
			   addWindowListener(new WindowAdapter(){
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}	   
				   });
			   
		}
		/**
		 * Ë«»º³å½â¾öÆÁÄ»ÉÁË¸
		 */
		private Image offScreenImage= null ;
			public void update(Graphics g){
			if(offScreenImage == null)
				offScreenImage = this.createImage(400,600);
			Graphics gOff = offScreenImage.getGraphics();
			paint(gOff);
			g.drawImage(offScreenImage, 0,0,null);
		}
		
		public void paint (Graphics g){
			g.drawImage(image,0,0,null);			
			p.draw(g);	
			for (int i = 0; i <zidanList.size(); i++) {
				ZiDan z = (ZiDan) zidanList.get(i);
				z.draw(g);
				//Åö×²¼ì²â
				boolean b =z.getrRectangle().intersects(p.getrRectangle());
			if(b){
				p.setAlive(false);
				over = new Date();
				System.out.println("###################");
				
				
			}
				
			}
			
			if(!p.isAlive()){
				
				long time = (over.getTime()-start.getTime())/1000;
				Color c =g.getColor();
				g.setColor(Color.white);
				Font f = new Font("ËÎÌå",Font.BOLD,40);
				g.setFont(f);
				g.drawString("GAME OVER", 100,290);
				Font f1 = new Font("ËÎÌå",Font.BOLD,30);
				g.setFont(f1);
				g.drawString("Ê±¼ä :"+time +"Ãë", 100,350);
				/*music1 m1 = new music1();
				//if(m1.g!=1)
				m1.a("C:/Users/Administrator/Desktop/burst.wav");				
				*/				
			  //  m1.aau1.stop();
				//g.drawString((String)time, 130, 350);
				g.setColor(c);
			}
		}
		class KeyMoniter extends KeyAdapter{

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyTyped(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
			//	super.keyPressed(e);
				System.out.println(e.getKeyCode());
				p.addFX(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);
				p.jianFX(e);
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
				new PlaneFrame().GameFrame();		
		}
}
