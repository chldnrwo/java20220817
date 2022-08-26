package p01Control;

public class C09For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("====================================================");
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================================================");
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================================================");
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>=0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================================================");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("====================================================");
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<i+2;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("====================================================");
		
		
			for(int j=0;j<10;j++) {
				System.out.print(j);
				if(j==0||j==2||j==5||j==9) {
					System.out.println();
				}
			}
			
		System.out.println("====================================================");
		for(int i = 0;i<5;i++) {
			//System.out.print("*");
			for(int j = 0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i = 0;i<5;i++) {
			//System.out.print("*");
			for(int j = 0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("====================================================");
		
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
