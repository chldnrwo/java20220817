package p01Method;

public class C04Parameter {
	public static void main(String[] args) {
		//여러줄이 출력되도록 파라미터와 아규번트 추가
		printTriangle(10);
	}
	
	public static void printTriangle(int m) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
