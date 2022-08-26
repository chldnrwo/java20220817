package p01Control;

public class C04Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Math.random():0이상 1미만의 double값 return
		double d=Math.random();
		System.out.println(d);
		
		//Math.random() * 6;
		System.out.println(d*6);
		//(int)(Math.random()*6): 0,1,2,3,4,5
		System.out.println((int)(d*6));
		//(int)(Math.random()*6)+1: 1,2,3,4,5,6
		System.out.println((int)(d*6)+1);
		//주사위 (1~6);
	}

}
