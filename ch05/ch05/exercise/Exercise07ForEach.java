package ch05.exercise;

public class Exercise07ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int item : array) {
			if(max<item) {
				max=item;
			}
		}
		
		
		System.out.println(" max: "+max);
	}

}
