package lecture.p03exceptions;

public class C03Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class a = Class.forName("java.lang.String");
			
			System.out.println(a.toString());
		}
		catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
	}

}
