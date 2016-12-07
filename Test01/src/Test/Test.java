package Test;

public class Test {
	public static void main(String[] args) {
		MyGame frame = new MyGame();
		GamePanel panel = new GamePanel();
		Controller con = new Controller(panel);
		panel.setGameControl(con);
		frame.setContentPane(panel);
	}
}
