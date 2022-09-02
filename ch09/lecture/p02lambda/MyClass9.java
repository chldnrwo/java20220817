package lecture.p02lambda;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class MyClass9 {
	public static void main(String[] args) {
		int[] a1=new int[10];
		setAll(a1, i -> i);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> i+1);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> i*2);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> 10-i);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> 9-i);
		System.out.println(Arrays.toString(a1));
		
		
	}

	public static void setAll(int[] a1, IntUnaryOperator gen) {
		// TODO Auto-generated method stub
		for(int i=0;i<a1.length;i++) {
			a1[i]=gen.applyAsInt(i);
		}
	}
}
