package p02reference;

public class C06Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,8};
		changeItems(a);
		System.out.println(a[0]);
	}		
	public static void changeItems(int[] arr) {
		System.out.println(arr[0]);  //a[0]9일때 출력
		arr=new int[] {3,4};	//새로 생선한 arr는 함수 밖으로 벗어나면 영향을 못미침
	}
}
