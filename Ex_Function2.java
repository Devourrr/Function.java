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
	 * �ۼ��� :
	 * �ۼ�����;
	 * ���: ����2���� �Է¹޾Ƽ� ���Ѱ��� �����ִ� �Լ� 
	 */
	
	public static int mySum( int a,int b) {
		return a+b;
		
	
	}
	public static int mySub(int a, int b) {
		// ū�� - ������
		// 
		int result ;
		int tmp;
//		result = (a>b)? a : b;	// ���� ū ���� result
		if (a<b) {
			tmp =a;
			a=b;
			b=tmp;
			
		}
		
		result = a-b;
		return result;
		
	}
}
