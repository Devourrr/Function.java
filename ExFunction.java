package week2_day5;

public class ExFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printTitle();
		printTitle();
		printTitle();
		printTitle();
		printTitle();
		printTitle();
		
		int num1, num2;
		num1=10; 
		num2=20;

		int result = Ex_Function2.mySum(num1,num2);
		System.out.println(result);
		int result2 = Ex_Function2.mySub(num1,num2);
		System.out.println(result2);
	}

	
	public static void printTitle() {
		System.out.println("|=================|");
		System.out.println("|===¼ºÀûÇ¥==========|");
		System.out.println("|=================|");
	
	}
	
}
