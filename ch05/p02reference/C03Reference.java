package p02reference;

import java.util.Arrays;

public class C03Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,5};
		int[] b = a;
		
		System.out.println(b[2]);
		
		a=new int[] {9,8,7};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(b[2]);
	}

}
