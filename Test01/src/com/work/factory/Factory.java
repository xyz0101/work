package com.work.factory;

import java.applet.AudioClip;
import java.util.Random;

import com.work.block.Block;
import com.work.block.Iblock;
import com.work.block.Jblock;
import com.work.block.Lblock;
import com.work.block.Oblock;
import com.work.block.Sblock;
import com.work.block.Tblock;
import com.work.block.Zblock;
import com.work.game.Music;

public class Factory {
	static int flag=0;
	static int i;
	static int j;
	public static Block randomBlock() {
		Block b = null;
		if(flag==0){
		j= new Random().nextInt(7);
		i= new Random().nextInt(7);
		flag=1;
		}else{
			i= new Random().nextInt(7); 
		}
		switch (j) {
		case 0:
			b=new Jblock();
		
			break;
		case 1:
			b=new Lblock();
			
			break;
		case 2:
			b=new Sblock();
			
			break;
		case 3:
			b=new Zblock();
			
			break;
		case 4:
			b=new Iblock();
			
			break;
		case 5:
			b=new Oblock();
			
			break;
		case 6:
			b=new Tblock();
			
			break;
		}
		j=i;
		return b;
		
	
	}
	public static Block getNextBlock(){
		Block b = null;
		System.out.println(i);
		switch (i) {
		case 0:
			b=new Jblock();
			break;
		case 1:
			b=new Lblock();
			break;
		case 2:
			b=new Sblock();
			break;
		case 3:
			b=new Zblock();
			break;
		case 4:
			b=new Iblock();
			break;
		case 5:
			b=new Oblock();
			break;
		case 6:
			b=new Tblock();
			break;
		}
		return b;
	}
	public static AudioClip getAu(String str){
		Music m = new Music();
		AudioClip au=m.getAudio("C:\\Users\\Administrator\\git\\Work\\Test01\\src\\music\\move.wav");
		AudioClip au1=m.getAudio("C:\\Users\\Administrator\\git\\Work\\Test01\\src\\music\\success.wav");
		AudioClip au2=m.getAudio("C:\\Users\\Administrator\\git\\Work\\Test01\\src\\music\\impact.wav");
		if(str.equals("impact"))
		return au2;
		else if(str.equals("move"))
			return au;
		else if(str.equals("delete"))
			return au1;
		return null;
	}
}
