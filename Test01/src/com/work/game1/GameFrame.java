package com.work.game1;

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

import com.work.block.Block;
import com.work.conts.Conts;
import com.work.factory.Factory;
import com.work.game.Music;
import com.work.wall.Wall;

public class GameFrame extends JFrame {
	Block b;
	Block b1;
	MyPaint p;
	JButton jb;
	JButton jb1;
	JButton jb2;
	Timer timer;
	int[][] arr;
	int[][] arr1;
	int index = 0;
	int level = 0;
	int source = 0;
	Wall w = new Wall();

	public GameFrame() {
		setSize(Conts.UI_WIDTH, Conts.UI_HEIGHT);
		setTitle("俄罗斯方块");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		p = new MyPaint();
		p.setFocusable(true);
		p.addKeyListener(new MyKeyAd());
		p.setLayout(null);
		MyAction1 my = new MyAction1();
		jb = new JButton("暂停");
		jb.setBounds(Conts.BUTTON_X, Conts.BUTTON_Y, Conts.BUTTON_WIDTH,
				Conts.BUTTON_HEIGHT);
		jb.addActionListener(my);
		jb1 = new JButton("重新开始");
		jb1.setBounds(Conts.BUTTON_X, Conts.BUTTON_Y + Conts.BUTTON_JG,
				Conts.BUTTON_WIDTH, Conts.BUTTON_HEIGHT);
		jb1.addActionListener(my);
		jb2 = new JButton("退出游戏");
		jb2.setBounds(Conts.BUTTON_X, Conts.BUTTON_Y + Conts.BUTTON_JG * 2,
				Conts.BUTTON_WIDTH, Conts.BUTTON_HEIGHT);
		jb2.addActionListener(my);
		p.add(jb);
		p.add(jb1);
		p.add(jb2);
		c.add(p);
		b = Factory.randomBlock();
		b1 = Factory.getNextBlock();
		arr = b.getTurn();
		arr1 = b1.getTurn();
		timer = new Timer(1000 - level, new MyAction());
		timer.start();
		setVisible(true);
	}

	public static void main(String[] args) {
		new GameFrame();
	}

	// 画板
	class MyPaint extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(null);
			// 墙壁
			paintWall(g);
			// 方块
			paintBlock(g);
			// 绘制下一个方块
			g.setFont(new Font("", 1, 16));
			g.drawString("下一个方块", 180, 30);
			paintNextBlock(g);
			// 绘制得分
			g.drawString("得分: " + source, 200, 110);
			// 绘制等级
			g.drawString("等级: " + (level / 100 + 1), 200, 140);
			// 游戏结束
			if (isOver()) {
				g.setFont(new Font("", 3, 40));
				g.setColor(Color.red);
				g.drawString("游戏结束", 65, 145);

			}
		}

		private void paintNextBlock(Graphics g) {

			for (int i = 0; i < arr1.length; i++)
				for (int j = 0; j < arr1[i].length; j++) {
					if (arr1[i][j] == 1)
						g.fillRect((j + b1.getX() + 15) * Conts.BLOCK_SIZE, (i
								+ b1.getY() + 5)
								* Conts.BLOCK_SIZE, Conts.BLOCK_SIZE,
								Conts.BLOCK_SIZE);

				}
		}

		private void paintBlock(Graphics g) {

			for (int i = 0; i < arr.length; i++)
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == 1)
						g.fillRect((j + b.getX() + 1) * Conts.BLOCK_SIZE,
								(i + b.getY()) * Conts.BLOCK_SIZE,
								Conts.BLOCK_SIZE, Conts.BLOCK_SIZE);

				}
		}

		private void paintWall(Graphics g) {
			for (int i = 0; i < Conts.MAP_COLS; i++)
				for (int j = 0; j < Conts.MAP_ROWS; j++) {
					if (w.wall[i][j] == 2)
						g.drawRect(i * Conts.BLOCK_SIZE, j * Conts.BLOCK_SIZE,
								Conts.BLOCK_SIZE, Conts.BLOCK_SIZE);
					if (w.wall[i][j] == 1)
						g.fillRect(i * Conts.BLOCK_SIZE, j * Conts.BLOCK_SIZE,
								Conts.BLOCK_SIZE, Conts.BLOCK_SIZE);
				}
		}
	}

	public void newBlock() {
		if (!isOver() && !isPause()) {
			b = Factory.randomBlock();
			b1 = Factory.getNextBlock();
			arr = b.getTurn();
			arr1 = b1.getTurn();
		}
	}

	// 判断是否结束
	public boolean isOver() {
		for (int j = 0; j < 16; j++) {
			if (w.wall[j][0] == 1) {
				timer.stop();
				return true;
			}
		}
		return false;
	}

	// 判断是否暂停
	public boolean isPause() {
		if (index % 2 == 1) {
			return true;
		} else
			return false;
	}

	public void deleteLine() {
		for (int i = 0; i < Conts.BLOCK_ROWS; i++) {
			int count = 0;
			for (int j = 0; j < Conts.BLOCK_COLS; j++) {
				if (w.wall[j][i] == 1) {
					count++;
					if (count == Conts.MAP_COLS - 2) {
						source += Conts.GRADE;
						if (level < Conts.DEFAULT_TIME) {
							level = (source / Conts.TIDU) * 100;
							timer.setDelay(Conts.DEFAULT_TIME - level);
							Factory.getAu("delete").play();
						}
						for (int n = i; n > 0; n--)
							for (int m = 0; m < Conts.BLOCK_COLS; m++)
								w.wall[m][n] = w.wall[m][n - 1];
					}
				}
			}
		}
	}

	// 线程监听
	class MyAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (b.isImpact(b.getX(), b.getY() + 1) == false)
				b.down();
			else {
				b.addBlock();
				deleteLine();
				newBlock();
			}
			repaint();
		}
	}

	class MyAction1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == jb) {
				index++;
				p.requestFocus();
				if (isPause()) {
					timer.stop();
					jb.setText("开始");
				} else {
					timer.start();
					jb.setText("暂停");
				}
			}
			if ((JButton) e.getSource() == jb1) {

				new Wall().firstWall();
				;
				newBlock();
				level = 0;
				timer.start();
				p.requestFocus();
				repaint();
			}
			if ((JButton) e.getSource() == jb2)
				System.exit(0);
		}
	}

	class MyKeyAd extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				int index = b.getIndex();
				Factory.getAu("move").play();
				b.turn();
				arr = b.getTurn();
				if (b.isImpact(b.getX(), b.getY()) || !isOver() || !isPause())
					b.setIndex(index);
				arr = b.getTurn();
				p.repaint();
				break;
			case KeyEvent.VK_LEFT:
				if (!b.isImpact(b.getX() - 1, b.getY()) && !isOver()
						&& !isPause()) {
					Factory.getAu("move").play();
					b.left();
					arr = b.getTurn();

				}
				p.repaint();
				break;
			case KeyEvent.VK_RIGHT:
				if (!b.isImpact(b.getX() + 1, b.getY()) && !isOver()
						&& !isPause()) {
					Factory.getAu("move").play();
					b.right();
					arr = b.getTurn();

				}
				p.repaint();
				break;
			case KeyEvent.VK_DOWN:
				if (!b.isImpact(b.getX(), b.getY() + 1) && !isOver()
						&& !isPause()) {
					Factory.getAu("move").play();
					b.down();
					arr = b.getTurn();

				} else {
					b.addBlock();
					newBlock();
					deleteLine();
				}
				p.repaint();
				break;
			}
		}

	}
}
