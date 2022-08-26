package ch05.lecture.p1.array;

public class C11ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문 for-each
		
		int[] a = {5,7,9,11};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("향상된 for");
		
		for(int item : a) {
			System.out.println(item);
		}
	}

}
