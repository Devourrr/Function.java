package week2_day5;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"stop" ���ڿ��� �Էµ� ������ �Էµ� ���ڿ� ���
		
		// ���
		String input ="";
		
		
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			sc.next();	//���ڿ� �Է�
			if( input .equals( "STOP")) { 	//���ڿ� ��
				break;
			}
			System.out.println( input); 
		}
		
	}

}
