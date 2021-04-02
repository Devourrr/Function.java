package week2_day5;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"stop" 문자열이 입력될 때까지 입력된 문자열 출력
		
		// 출력
		String input ="";
		
		
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			sc.next();	//문자열 입력
			if( input .equals( "STOP")) { 	//문자열 비교
				break;
			}
			System.out.println( input); 
		}
		
	}

}
