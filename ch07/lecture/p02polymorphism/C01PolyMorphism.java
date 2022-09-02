package lecture.p02polymorphism;

public class C01PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동형변환
		SubClass1 o1 = new SubClass1();
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		
		SuperClass1 o4 = o1;
		
		SuperClass1 o5 = new SuperClass1();
		//SubClass1 o6 = new SuperClass1();
		//SubClass1 o7 = new SuperClass1();
		
		//SubClass1 o8 = o4; 강제로는 가능하다
	}

}
