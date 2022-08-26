package p02reference;

import java.util.Arrays;

public class C05Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {99,88,77};
		
		changeItem(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		
		int[]b = {7,6};
		changeItem(b);
		System.out.println(Arrays.toString(b));
		System.out.println(b[0]);
	}
	
	private static void changeItem(int[] a) {
		a[0]=3; //적용됨
	}

}
