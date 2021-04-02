package week2_day5;

public class Ex02 {
	// 1. 배열중에서 가장 큰 값 구하기 : MAX
	// 2. 배열의 평균값보다 큰 수 구하기
	public static void main(String[] args) {
		
		int[] arr = { 90,60,75,89,71}; //int[] arr2 = new int[] {10,25,35,10,20};
		//출력자료
		int max= arr[0];
		//처리자료
		int i;
		
		for(i=0; i<arr.length; i++) {
			
			if( max < arr[i]) {
				max = arr[i];
			}
		}
		//출력
		System.out.println(max);
		
		
		// 
		

	}

}
