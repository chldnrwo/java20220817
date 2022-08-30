package ch06.lecture.p05final;

public class MyClass1 {
	//static final : 상수
	//상수명 작성 관습 : UPPER_SNAKE_CASE
	static final int ABC = 9999;
	static final int DEF;
	static final int MY_HOME_NUMBER=0;
	
	final int a=5;
	final int b;
	
	static {
		DEF=10000;
	}
	
	MyClass1(){
		b=9;
	}
	
	MyClass1(int b){
		this.b=b;
	}
	MyClass1(int c, int d){
		this.b=999;
	}
}
