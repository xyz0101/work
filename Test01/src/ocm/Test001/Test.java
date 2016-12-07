package ocm.Test001;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(33);
		list.add(22);
		list.add(11);
		list.set(1, 44);
		System.out.println(list.size());
		//list.get(1);
	}
	
}
