package p01Method;

public class C12Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = half(5.0);
		System.out.println(a);  //2.5
		
		int b = half(5);
		System.out.println(b); //2
	}
	public static double half(double n) {
		
		return n/2;
	}
	public static int half(int n) {
		return n/2;
	}
}
