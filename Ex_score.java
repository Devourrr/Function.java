package week2_day5;

import java.util.Scanner;

public class Ex_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inv_avg;
		double kor_avg, eng_avg, math_avg;
		String name;
		int kor_score, eng_score, math_score;
		String result=""; //���ڿ��ʱ�ȭ ���ڿ� =""
		int inv_sum, kor_sum=0, eng_sum=0, math_sum=0; //���ڿ��ʱ�ȭ =0
		
		final int MAX=3;
		
		Scanner sc = new Scanner(System.in); //�Է��� ���� �����޸� new �������̿�
		for(int i=1; i<=MAX; i++) {
			name = sc.next();
			kor_score = sc.nextInt();
			eng_score = sc.nextInt();
			math_score = sc.nextInt();
			
			inv_sum = kor_score+eng_score+math_score;
			inv_avg = inv_sum/3;
			if (inv_avg>=90) {
				result="EXCELLENT";
				}
				else if (inv_avg<60) {
				result="FAIL";
				}else {
					result="";
				}
				System.out.println("�̸�: "+name+"����: "+kor_score+"����: "+eng_score+"����: "+math_score+"�������: "+inv_avg+" "+result);
					kor_sum += kor_score;
					eng_sum += eng_score;
					math_sum += math_score;
			}
			//���� ��� ���ϱ�
			kor_avg = kor_sum /(double) MAX;
			eng_avg = eng_sum /(double) MAX;
			math_avg = math_sum/(double) MAX;
					
					System.out.println("�������� ���:" + kor_avg);
					System.out.println("�������� ���:" + eng_avg);
					System.out.println("�������� ���" + math_avg);
		}
		
		
	}


