package week2_day5;

public class Ex_03 {
	// 2. �迭�� ��հ����� ū ���� ���ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 ����ڷ� : ��պ��� ū ���� : cnt;
		 �Է��ڷ� :
		 �غ��� : �迭 (������ 5���迭) : arr
		 ó���ڷ� : �迭 ��ü �հ� : sum
				��� : avg
				�ݺ������ : i
				
		 ó������
		 1. �հ豸�ϱ�
		 	1.1 �迭 ��� �����ϱ�
		 2. ��ձ��ϱ�
		 3. �ݺ�
		 	3.1 ��հ����� ũ�� ���� ����
		 4. ��հ����� ū ���� ���
		 	 
		 
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
		System.out.println("���="+avg+"��հ� ���� ū ���� : " + cnt);
	}

}
