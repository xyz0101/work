package com.Test;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class game extends MyFrame {
	Image bg = GameUtil.getImage("image/sky.jpg");
	Image sun = GameUtil.getImage("image/sun.png");
	Image earth = GameUtil.getImage("image/earth.png");
	Image tuxing = GameUtil.getImage("image/tx.png");
	Image sx = GameUtil.getImage("image/sx.png");
	Image jx = GameUtil.getImage("image/jx.png");
	Image hx = GameUtil.getImage("image/hx.png");
	Image twx = GameUtil.getImage("image/twx.png");
	Image hwx = GameUtil.getImage("image/hwx.png");
	Image mx = GameUtil.getImage("image/mx.png");
	Image moon = GameUtil.getImage("image/moon.png");
	private double x=500,y=225,m7=525,n7=315,m=515,n=305,m1=495,m2=535,m3=555,m4=575,m5=595,m6=615,n1=175,n2=305,n3=305,n4=300,n5=300,n6=295;
	private double degree = 0,degree8 = 0,degree1 = 0,degree2 = 0,degree3 = 0,degree4 = 0,degree5 = 0,degree6 = 0,degree7 = 0;
	private double speed = 5;	
	private Image offScreenImage= null ;
	public void update(Graphics g){
	if(offScreenImage == null)
		offScreenImage = this.createImage(1100,600);
	Graphics gOff = offScreenImage.getGraphics();
	paint(gOff);
	g.drawImage(offScreenImage, 0,0,null);
}
	@Override	
	public void paint(Graphics g) {		   
		   g.drawImage(bg, 0, 0, 1100,600,null);	
		   g.setColor(Color.yellow);
		   g.drawOval(250+170, 50+200, 150, 100);//水
		   g.drawImage(sx,(int)m1 ,(int)n1, 20,20,null);
		   g.drawOval(250+60, 50+130, 450, 250);//火
		   g.drawImage(hx,(int)m2 ,(int)n2, 25,20,null);
		   g.drawOval(250+30, 50+105, 550, 300);//木
		   g.drawImage(mx,(int)m3 ,(int)n3, 20,20,null);
		   g.drawOval(250+00, 50+75, 650, 350);//土
		   g.drawImage(tuxing,(int)m4 ,(int)n4, 20,20,null);
		   g.drawOval(250-30, 50+50, 750, 400);//天
		   g.drawImage(twx,(int)m5 ,(int)n5, 20,20,null);
		   g.drawOval(250-60, 50+20, 850, 450);//海
		   g.drawImage(hwx,(int)m6 ,(int)n6, 20,20,null);
		   g.drawOval(250+125, 50+175, 250, 150);//金
		   g.drawImage(jx,(int)x ,(int)y, 20,20,null);
		   g.drawOval(250+90, 50+155, 350, 200);//地
		   g.drawImage(earth,(int)m ,(int)n, 20,20,null);		   
		   g.drawImage(sun,250+220 ,50+ 220, 50,50,null);
		   g.setColor(Color.BLACK);   		 
		   g.drawImage(moon,(int)m7 ,(int)n7, 15,15,null);	
		   	m=505+ 175*Math.cos(degree2); 
			n=295+ 100*Math.sin(degree2);
			m7=505+ 175*Math.cos(degree2)+15*Math.cos(degree8);
			n7=295+ 100*Math.sin(degree2)+15*Math.sin(degree8);
			degree2+=0.07;
			degree8+=0.8;			
			m1=485+ 75*Math.cos(degree1); 
			n1=290+ 50*Math.sin(degree1);
			degree1+=0.1;
			m2=525+ 225*Math.cos(degree3); 
			n2=295+ 125*Math.sin(degree3);
			degree3+=0.06;
			m3=545+ 275*Math.cos(degree4); 
			n3=295+ 150*Math.sin(degree4);
			degree4+=0.05;
			m4=565+ 325*Math.cos(degree5); 
			n4=290+ 175*Math.sin(degree5);
			degree5+=0.04;
			m5=585+ 375*Math.cos(degree6); 
			n5=290+ 200*Math.sin(degree6);
			degree6+=0.03;
			m6=605+ 425*Math.cos(degree7); 
			n6=285+ 225*Math.sin(degree7);
			degree7+=0.02;	
			x=490+ 125*Math.cos(degree); 
			y=290+ 75*Math.sin(degree);
			degree+=0.09;
	}
	
    public static void main(String[] args) {
		new game().GameFrame();
	}
}