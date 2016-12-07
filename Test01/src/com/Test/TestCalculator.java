package com.Test;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

 @SuppressWarnings("serial")
class TestCalculator extends JFrame implements WindowListener{
		 public TestCalculator(){
			 super();
			 JButton jsq[][] = new JButton[4][5];			
			this.setBounds(50, 50, 300, 400);
			this.setVisible(true);
			String sz[][] ={
					{"1","2","3","+","-"},
					{"4","5","6","*","/"},
					{"7","8","9","",""},
					{".","0","CE","1/x","="}
			};
		}
	

	 
		
	
public static void main(String[] args) {
	new TestCalculator();
}





@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent e) {
	// TODO Auto-generated method stub
	dispose();
}
@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
}
