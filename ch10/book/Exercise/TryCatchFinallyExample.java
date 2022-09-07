package book.Exercise;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"10","2a"};
		int value=0;
		for(int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("인덱스를 초과했음");
			}
			catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}
			finally {
				System.out.println(value);
			}
		}
	}

}
//10    					첫번째 인덱스는 무사히 변환됨
//숫자로 변환할 수 없음    두번째 인덱스 2a를 변환하려고해서 발생하는 exception
//10						finally로 인해 무조건 실행되는 인덱스(현재 value에는 strArray[0]을 int로 파싱한 것이 그래도 들어있음)
//인덱스를 초과했음			두개짜리 인덱스에 3번째 값에 접근하려해서 발생하는 exception
//10						finally로 인해 무조건 실행되는 인덱스(현재 value에는 strArray[0]을 int로 파싱한 것이 그래도 들어있음)
