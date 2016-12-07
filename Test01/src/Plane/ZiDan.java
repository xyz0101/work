package Plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class ZiDan {
	
	double x=200,y=300;
	int speed =5;
	double degree;
	int w=10,h=10;
	public ZiDan(){
		degree = Math.random()*Math.PI*2;
	}
	public Rectangle getrRectangle(){
		Rectangle r = new Rectangle((int)x,(int)y,8,8);
		return r;
	}
			public void draw(Graphics g){
				Color c =g.getColor();
				g.setColor(Color.red);
				g.fillOval((int)x, (int)y, w, h);
				
				x+=speed*Math.cos(degree);
				y+=speed*Math.sin(degree);
				g.setColor(c);
				if(y>600-10||y<10){
					degree = -degree;
				}
				if(x<0||x>400-10){
					degree = Math.PI-degree;
				}
			}		
}
