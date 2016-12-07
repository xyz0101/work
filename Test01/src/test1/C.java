package test1;

public class C {
		public static void main(String[] args) {
			int[] a = new int[]{5,8,1,2,9};
			int max=a[0],min=a[0];
			for(int i=1;i<a.length-1;i++){
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
			}
			System.out.println(max);
			System.out.println(min);
		}
}
