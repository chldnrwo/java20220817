package lecture.p01Inheritance.package2;

import lecture.p01Inheritance.package1.SuperClass6;

public class SubClass6 extends SuperClass6{
		
	public void someMethod() {
		//super.privatMethod();
		//super.packagePrivateMethod();
		super.protectedMethod();
		super.publicMethod();
	}
		
}
