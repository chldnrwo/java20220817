package p02reference;

public class C04Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		printVar(a);
		int b=5;
		printVar(b);
		
		int[] c = {9,1,2};
		printArray(c);
		
		int[] d = {99,88,77};
		printArray(d);
	}
	private static void printVar(int a) {
		System.out.println(a);
	}
	private static void printArray(int[] c) {
		System.out.println(c[0]);
	}
}
