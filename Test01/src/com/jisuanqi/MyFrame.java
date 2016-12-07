package com.jisuanqi;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
private static String[] str = new String[]{"%","¸ùºÅ","Æ½·½","µ¹Êý","CE","C","<-","/","7","8","9","*","4","5","6","-","1","2","3","+","·´","0",".","="};
		JLabel jl ;
		JLabel jl1;
		JTextField jt;
		int flag;
		int count=0;
		
		StringBuffer sb =new StringBuffer("");
		StringBuffer sb1 = new StringBuffer("");
		StringBuffer sb2 = new StringBuffer("");
		int sum=0;
	public MyFrame(){
		setSize(400, 600);
		setTitle("¼ÆËãÆ÷");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jl = new JLabel("");
		 jl1 = new JLabel("");
		 jt = new JTextField();
		jt.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 19));
		JButton jb = null;	
		JPanel jp = new JPanel();
		JPanel jp1 = new JPanel();
		Container c = getContentPane();
		c.setLayout(null);
		jp1.setSize(400,150);
		jp1.setLayout(new GridLayout(3,0));
		jp1.add(jl);
		jp1.add(jl1);
		jp1.add(jt);
		c.add(jp1);
		jp.setBounds(0, 150, 385, 415);;
		for (int i = 0; i < str.length; i++) {
			jb = new JButton(str[i]);
			jb.addActionListener(new MyAcLin());
			jb.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 19));
			jp.setLayout(new GridLayout(6,4));
			jp.add(jb);
		}
		c.add(jp);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new MyFrame();
	}
	class MyAcLin implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb1 = (JButton) e.getSource();
			System.out.println(jb1.getText());
			String str="0.123456789";
			
			if(str.contains(jb1.getText())){
				sb.append(jb1.getText());
				sb1.append(jb1.getText());
			}
			else {
				if(!jb1.getText().contains("C")&&!jb1.getText().equals("<-")){
				sb.append(jb1.getText());
				jl1.setText(sb.toString());
				}else if(jb1.getText().contains("C")){
					flag=0;
					count=0;
					sb =new StringBuffer("");
					sb1 = new StringBuffer("");
					sb2 = new StringBuffer("");
					sum=0;
					jt.setText(sb1.toString());	
					jl1.setText(sb.toString());
				}else if(jb1.getText().equals("<-")){
					int ind=0;
					ind++;
					if(jt.getText().length()>0)
					sb1.delete(jt.getText().length()-ind, jt.getText().length());
					sb.delete(jl1.getText().length()-ind, jl1.getText().length());
					System.out.println(sb);
				}
			
				 if(jb1.getText().equals("+")){
					flag=0;
					count=1;
					String str1 = sb1.toString();
					sum+=Integer.parseInt(str1);
					if(count>1)
					sb1=new StringBuffer(String.valueOf(sum));
					else
					sb1=new StringBuffer("");
					System.out.println("sum+-----"+sum);
					
				}
				 if(jb1.getText().equals("=")){
					String str1 = sb1.toString();
					if(flag==0)
					sum+=Integer.parseInt(str1);
					else	if(flag==1)
						sum-=Integer.parseInt(str1);
					else	if(flag==2)
						sum*=Integer.parseInt(str1);
					else	if(flag==3)
						sum/=Integer.parseInt(str1);
					sb1=new StringBuffer(String.valueOf(sum));
				}
				 if(jb1.getText().equals("-")){
					flag=1;
					count=1;
					String str1 = sb1.toString();
					sum=Integer.parseInt(str1)-sum;
					if(count>1)
						sb1=new StringBuffer(String.valueOf(sum));
						else
						sb1=new StringBuffer("");
				} 
				 if(jb1.getText().equals("*")){
					flag=2;
					count=1;
					String str1 = sb1.toString();
					if(sum==0&&count<=1)
						sum=1;
					sum=Integer.parseInt(str1)*sum;
					if(count>1)
						sb1=new StringBuffer(String.valueOf(sum));
						else
						sb1=new StringBuffer("");
					
				}
				 if(jb1.getText().equals("/")){
					flag=3;
					count=1;
					System.out.println("sum-----"+sum);
					String str1 = sb1.toString();
					if(sum==0)
						sum=1;
					sum=Integer.parseInt(str1)/sum;
					if(count>1)
						sb1=new StringBuffer(String.valueOf(sum));
						else
						sb1=new StringBuffer("");
				}
			}
				jt.setText(sb1.toString());	
				jl1.setText(sb.toString());
		}
		
	}
	
}
