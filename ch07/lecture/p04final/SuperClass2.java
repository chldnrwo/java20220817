package lecture.p04final;

public class SuperClass2 {
	public void method1() {
		
	}
	public final void method2() {
		
	}
}
class SubClass extends SuperClass2{
	@Override
	public void method1() {
		
	}
//	public void method2() {
//		
//	}   //final 메소드는 재정의 불가
}