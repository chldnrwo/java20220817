package lecture.p01object;

import java.util.Scanner;

public class C01Object {

	public static void main(String[] args) {
		// 모든 클래스의 상위 클래스
		
		Object o1 = "topgun";
		Object o2 = new Scanner("java");
		Object o3 = new ArrayIndexOutOfBoundsException();
		Object o4 = new int[] {3,4,5};
		Object o5 = new String[] {"maverick","coyote","rooster"};
		
		Object o6 = 3;
		Object o7 = true;
		Object o8 = 3.14;
		
		Object[] o9 = {
				"goose",
				new int[] {3,4},
				new ArrayIndexOutOfBoundsException(),
				new String[] {"maverick","coyote","rooster"}
		};
	}

}
