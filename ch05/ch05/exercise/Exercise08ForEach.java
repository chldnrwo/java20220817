package ch05.exercise;

public class Exercise08ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array={{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0.0;
		
		int cnt=0;
		for(int[] item1 : array) {
			for(int item2 : item1) {
				sum=sum+item2;
				cnt++;
			}
		}
		avg = (double)sum/cnt;
		
		
		System.out.println(" sum: "+sum);
		System.out.println(" avg: "+avg);
	}

}
