package week2_day5;

public class Ex_03 {
	// 2. 배열의 평균값보다 큰 개수 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 출력자료 : 평균보다 큰 개수 : cnt;
		 입력자료 :
		 준비라료 : 배열 (정수값 5개배열) : arr
		 처리자료 : 배열 전체 합계 : sum
				평균 : avg
				반복제어변수 : i
				
		 처리과정
		 1. 합계구하기
		 	1.1 배열 요소 누적하기
		 2. 평균구하기
		 3. 반복
		 	3.1 평균값보다 크면 개수 증가
		 4. 평균값보다 큰 개수 출력
		 	 
		 
		*/
		int[] arr = {89,98,78,99,89};
		int cnt=0;
		int sum=0;
		double avg;
		
		for( int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / (double) arr.length ;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> avg) {
				cnt++; // cnt = cnt+1;
				
			}
		}
		System.out.println("평균="+avg+"평균값 보다 큰 개수 : " + cnt);
	}

}
