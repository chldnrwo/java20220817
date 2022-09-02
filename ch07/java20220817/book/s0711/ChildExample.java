package java20220817.book.s0711;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2;
		//parent.method3();
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
		
	}

}
