package ch05.book;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1="신민철";
		String strVar2="신민철";
		
		if(strVar1==strVar2){
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)){
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3=new String("신민철");
		String strVar4=new String("신민철");
		if(strVar3==strVar4){
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)){
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		//동일한 문자열 리터럴로 생성된 두 객체는 참조값이 같다
		//하지만 new String으로 객체를 별도로 생성할 경우엔 리터럴의 경우와 같지 않으며
		//같은 방식으로 따로 만든 new String과도 참조값이 같지 않다.
	}

}
