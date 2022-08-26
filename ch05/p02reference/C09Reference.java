package p02reference;

import java.util.Arrays;

public class C09Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{5,4},{100,200},{9}};
		
		System.out.println(Arrays.deepToString(a));
		
		int[][] b=a;
		System.out.println(Arrays.deepToString(b));
		
		a[0][0]=55;
		System.out.println(b[0][0]); //55
		
		a[0]=new int[] {7,5}; //main내에서 변경한거라 적용됨
		System.out.println(a[0][0]); //7
		System.out.println(b[0][0]); //7
	}

}
