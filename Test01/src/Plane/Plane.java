package Plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Plane {
	double x=50,y=50;
	Image img ;
	int flag;
	Image burst;
	int cont = 0;
	boolean U,D,L,R;
	private boolean alive=true;
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public Rectangle getrRectangle(){
		Rectangle r = new Rectangle((int)x,(int)y,40,20);
		return r;
	}
	public void draw(Graphics g){
		if(alive){
		g.drawImage(img, (int)x,(int)y,null);
		
		move();
			}
		if(alive==false){
			g.drawImage(burst, (int)x,(int)y,null);
			flag = 1;
		}
		
		
		
		}
	public Plane(String imgpath){
		super();
		this.img = GameUtil.getImage(imgpath);
		this.burst = GameUtil.getImage("img1/burst.png");
		
	}
	public void move(){
		if(L==true&&x-20>=0){
			x-=10;
		}
		if(U==true&&y-45>=0){
			y-=10;
		}
		if(R==true&&x+64<=400){
			x+=10;
		}
		if(D==true&&y+30<=600){
			y+=10;
		}
		
	}
	public void addFX(KeyEvent e){
		switch (e.getKeyCode()) {
		case 37:
			L=true;
			break;
		case 38:
			U=true;
			break;
		case 39:
			R=true;
			break;
		case 40:
			D=true;
break;

		default:
			break;
		}
	}
	public void jianFX(KeyEvent e){
		switch (e.getKeyCode()) {
		case 37:
			L=false;
			break;
		case 38:
			U=false;
			break;
		case 39:
			R=false;
			break;
		case 40:
			D=false;
break;

		default:
			break;
		}
	}
	}
