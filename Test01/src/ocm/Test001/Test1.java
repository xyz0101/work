package ocm.Test001;

public class Test1 {
		public void print(){
			new test1.print(){
				void exprint(){
					super.test();
				}
			}.exprint();
		}
		public static void main(String[] args) {
			new Test1().print();
		}
}
