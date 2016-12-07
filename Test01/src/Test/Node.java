package Test;

public class Node {
		int x;
		int y;
		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public boolean equals(Node node ){
			if(x==node.x&&y==node.y)
				return true;
			return false;
			
		}
}
