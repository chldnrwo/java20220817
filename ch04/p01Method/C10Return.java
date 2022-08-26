package p01Method;

public class C10Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = max(3, 5);
		System.out.println(a);
		
		int b = max(5, 3);
		System.out.println(b);
		
		int c = max(-100, 100);
		System.out.println(c);
		
		int d = max(100, 200);
		System.out.println(d);
	}
	private static int max(int n, int m) {
		if(n > m) {
			return n;
		}
		
		return m;
	}
}
