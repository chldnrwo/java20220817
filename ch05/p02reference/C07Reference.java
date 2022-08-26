package p02reference;

public class C07Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,8,7};
		System.out.println(a[0]); //a[0]인 9출력
		
		changeItems(a); // 9랑 3출력
		System.out.println(a[0]); // 함수내에서 바뀐것은 영향x
	}
	public static int[] changeItems(int[] arr) {
		System.out.println(arr[0]); //9,8,7에서 arr[0]인 9출력
		arr = new int[]{3,4,5};  //함수밖에서 영향x
		System.out.println(arr[0]); //3,4,5로 바뀐상태에서 arr[0]인 3출력
		return arr;
	}

}
