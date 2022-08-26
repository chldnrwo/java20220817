package p02reference;

public class C08Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,8,7};
		a = changeArray(a);  //9  원래 배열의 a[0], 함수내에서 2,4로 바꾸고 저장
		System.out.println(a[0]);//2  
		int[] b= {5,6,7};
		b= changeArray(b); //5 원래배열 b[0], 함수내에서 2,4로 바꾸고 저장
		System.out.println(b[0]);//2
		
		a[0]=100;
		System.out.println(a[0]); //100 a[0]을 100으로 바꾸고 출력
		System.out.println(b[0]); //위에서 영향받은게 더 없으므로 그대로 2
	}
	public static int[] changeArray(int[] arr) {
		System.out.println(arr[0]); //원래 배열의 0번째 값을 출력하고
		arr=new int[] {2,4}; // {2,4}로 배열을 바꿈
		return arr; //리턴
	}
}
