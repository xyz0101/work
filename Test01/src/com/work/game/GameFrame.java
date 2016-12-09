package com.work.game;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class GameFrame extends JFrame {
	//�����ʼλ��	
	int x=0,y=0;
	//��ʼ������
	Block b = new Block();
	//��ʼ����Ч
	Music m = new Music();
	AudioClip au=m.getAudio("C:\\Users\\Administrator\\git\\Work\\Test01\\src\\music\\move.wav");
	AudioClip au1=m.getAudio("C:\\Users\\Administrator\\git\\Work\\Test01\\src\\music\\success.wav");
	AudioClip au2=m.getAudio("C:\\Users\\Administrator\\git\\Work\\Test01\\src\\music\\impact.wav");
	//�÷�
	int source=0;
	//���������Լ�����
	int type=0 ,turn=0;
	MyPaint p ;
	JButton jb ;
	JButton jb1 ;
	JButton jb2 ;
	Timer timer ;
	int wall[][]=b.wall;
	//��ʼ����ͣ����
	int index=0;
	int level=0;
	public GameFrame() {
		setSize(300, 350);
		setTitle("����˹����");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane();
		p = new MyPaint();
		p.setFocusable(true);
		p.addKeyListener(new MyKeyAd());
		p.setLayout(null);
		MyAction1 my = new MyAction1();
		jb = new JButton("��ͣ");
		jb.setBounds(180, 150, 100, 35);
		jb.addActionListener(my);
		jb1 = new JButton("���¿�ʼ");
		jb1.setBounds(180, 200, 100, 35);
		jb1.addActionListener(my);
		jb2 = new JButton("�˳���Ϸ");
		jb2.setBounds(180, 250, 100, 35);
		jb2.addActionListener(my);
		
		p.add(jb);
		p.add(jb1);
		p.add(jb2);
		c.add(p);
		newBlock();
		timer = new Timer(1000-level, new MyAction());
		timer.start();
		setVisible(true);
	}
	public static void main(String[] args) {
		new GameFrame();
	}
	//����
	class MyPaint extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(null);
			b.initWall();
			int [][][] block = b.shape;	
			//ǽ��
			for (int i = 0; i < 17; i++)
				for (int j = 0; j < 30; j++) {
					if(wall[i][j]==2)
					g.drawRect(i * 10, j * 10, 10, 10);
					if(wall[i][j]==1)
						g.fillRect(i * 10, j * 10, 10, 10);
				}
			//����
			for(int i=0;i<16;i++)
				if(block[type][turn][i]==1)
					//������״
					g.fillRect((1+x+i%4)*10, (y+i/4)*10, 10, 10);
					//������һ������ 
					g.setFont(new Font("", 1, 16));
					g.drawString("��һ������", 180, 30);
			for(int i=0;i<16;i++)
				if(block[b.type1][b.turn1][i]==1)
					//������״
					g.fillRect((1+20+i%4)*10, (4+i/4)*10, 10, 10);
					//���Ƶ÷�
					g.drawString("�÷�: "+source, 200, 110);
					//���Ƶȼ�
					g.drawString("�ȼ�: "+(level/100+1), 200, 140);
					//��Ϸ����
					if(isOver()){
						g.setFont(new Font("", 3, 40));
						g.setColor(Color.red);
						g.drawString("��Ϸ����", 65, 145);
				
			}			
		}
	}
			//���������
			class MyAction1 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					if((JButton)e.getSource()==jb){
						index++;
						p.requestFocus();
						if(isPause()){
							timer.stop();
							jb.setText("��ʼ");						
						}
						else{
							timer.start();
							jb.setText("��ͣ");						
						}						
					}
					if((JButton)e.getSource()==jb1){
						b.firstWall();
						newBlock();
						level=0;
						timer.start();
						p.requestFocus();
						repaint();
					}						
					if((JButton)e.getSource()==jb2)
						System.exit(0);
				}				
			}
			//�̼߳���
			class MyAction implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					if(isImpact(x,y+1)==false&&!isOver())
						y++;
						else
						{   
							 addBlock();
							 deleteLine();
							 newBlock();				
					}				
				repaint();
				}			
			}
			//����������
		class MyKeyAd extends KeyAdapter{
			@Override
			public void keyPressed(KeyEvent e) {
				if(!isPause()){
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					au.play();
					turn();	
					System.out.println("��");
					break;
				case KeyEvent.VK_LEFT:
					au.play();
					left();
					System.out.println("��");
					break;
				case KeyEvent.VK_RIGHT:
					
					au.play();
					right();
					System.out.println("��");
					break;
				case KeyEvent.VK_DOWN:
					au.play();
					down();
					System.out.println("��");
					break;				
				}
				System.out.println(222);
			}
		}
	}	
		//�����·���
		public void newBlock(){
			if(!isOver()&&!isPause()){
			b.getNextBlock();
			x=6;
			y=0;
			type=b.getType();
			turn=b.getTurn();
				}
			}
		//����任
		public void turn(){
			int temp = turn;
			turn = (turn + 1)%4;
			if(isImpact(x, y)||isOver()||isPause())
				turn=temp;	
			repaint();
		}
		public void down(){
			if(!isImpact(x,y+1)&&!isOver()&&!isPause()){
				y++;
			}	
			else {
				addBlock();
				deleteLine();
				newBlock();
			}
			p.repaint();
		}
		public void left(){
			if(!isImpact(x-1,y)&&!isOver()&&!isPause()){
				x--;
				}
			p.repaint();
		}
		public void right(){
			if(!isImpact(x+1,y)&&!isOver()&&!isPause()){
				x++;
			}
			p.repaint();
		}
		//��ײ���
		private boolean isImpact(int x,int y) {
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++){
					if(b.shape[type][turn][i*4+j]==1&&wall[x+1+j][y+i]==1){
						au2.play();
						System.out.println(2323232);
						return true;
					}		
					else if(b.shape[type][turn][i*4+j]==1&&wall[x+1+j][y+i]==2){
						au2.play();	
						return true;
					}
				}
						return false;
		}
		//����
		public void deleteLine(){
			for(int i=0;i<29;i++){
				int count=0;		
				for(int j=0;j<16;j++){
					if(wall[j][i]==1){
						count++;
						if(count==15){
							source+=10;
							if(level<1000){
								level=(source/30)*100;
								timer.setDelay(1000-level);
								au1.play();
							}
							for(int n=i;n>0;n--)
								for(int m=0;m<16;m++)
									wall[m][n]=wall[m][n-1];
						}
				//		System.out.println(count+"------------");
					}
				}
			}
		}
		//��ӷ���
		public void addBlock(){
			int con=0;
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++){
					if(wall[x+j+1][y+i]==0){
    					wall[x+j+1][y+i]=b.shape[type][turn][con];
    				}
					con++;
				}
			b.outWall();
		}
		//�ж��Ƿ����
		public boolean isOver(){	
				for(int j=0;j<16;j++){
					if(wall[j][0]==1){
						timer.stop();
					//System.out.println("����������������������");
							return true;
				}
		}
			return false;
		}
		//�ж��Ƿ���ͣ
		public boolean isPause(){	
			if(index%2==1){
				return true;
	}else
		return false;
	}	
}
