package week2_day5;

public class Ex02 {
	// 1. �迭�߿��� ���� ū �� ���ϱ� : MAX
	// 2. �迭�� ��հ����� ū �� ���ϱ�
	public static void main(String[] args) {
		
		int[] arr = { 90,60,75,89,71}; //int[] arr2 = new int[] {10,25,35,10,20};
		//����ڷ�
		int max= arr[0];
		//ó���ڷ�
		int i;
		
		for(i=0; i<arr.length; i++) {
			
			if( max < arr[i]) {
				max = arr[i];
			}
		}
		//���
		System.out.println(max);
		
		
		// 
		

	}

}
