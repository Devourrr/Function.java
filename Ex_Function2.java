package week2_day5;

public class Ex_Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a=b=10;
		int sum =0;
		sum = a+b;
		int reseult = mySum(a, b);
		
	}
	/*
	 * 작성자 :
	 * 작성일자;
	 * 기능: 정수2개를 입력받아서 더한값을 돌려주는 함수 
	 */
	
	public static int mySum( int a,int b) {
		return a+b;
		
	
	}
	public static int mySub(int a, int b) {
		// 큰값 - 작은값
		// 
		int result ;
		int tmp;
//		result = (a>b)? a : b;	// 둘중 큰 값이 result
		if (a<b) {
			tmp =a;
			a=b;
			b=tmp;
			
		}
		
		result = a-b;
		return result;
		
	}
}
