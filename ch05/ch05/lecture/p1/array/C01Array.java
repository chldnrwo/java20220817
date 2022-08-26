package ch05.lecture.p1.array;

public class C01Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array 값을 저장하는 공간 타입[]
		
		int[] arr;
		double[] arr2;
		String[] arr3;
		
		int a;
		a=3;
		
		int[] arr4;
		arr4 = new int[5]; //int값 5개 저장할 공간 생성
		
		arr4[0] = 10;
		arr4[1] = 11;
		arr4[2] = 99;
		arr4[3] = 100;
		arr4[4] = 200;
		//arr4[5] = 300; //5번 인덱스는 없믐
		for(int i=0;i<5;i++) {
		System.out.println(arr4[i]);
		}
	}

}
