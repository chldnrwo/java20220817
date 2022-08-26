package p02reference;

import java.util.Arrays;

public class C10Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b=3;
		
		System.out.println(a==b); //true
		int[] c = new int[]{3,4,5};
		int[] d = new int[]{3,4,5};
		
		System.out.println(c==d);  
		//변수타입의 경우 스택에 값이 저장되서 저렇게 비교할 경우 true가 나오지만
		//참조타입의 경우 스택엔 주소가 저장되고 실제값은 힙에 저장되기에 주소가 달라서 false가 나온다
		System.out.println(Arrays.equals(c, d)); //true
		int[] e=c;
		e[0]=33;
		System.out.println(c[0]); //33
		System.out.println(d==c); //false
		System.out.println(Arrays.equals(c, d)); // false
	}

}
