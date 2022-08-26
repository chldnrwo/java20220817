package p01Method;

public class C06Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1, 10);
		sum(1, 100);
		sum(50, 200);
	}
	public static void sum(int n, int m) {
		int sum=0;
		for(int i=n;i<=m;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
