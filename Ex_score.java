package week2_day5;

import java.util.Scanner;

public class Ex_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inv_avg;
		double kor_avg, eng_avg, math_avg;
		String name;
		int kor_score, eng_score, math_score;
		String result=""; //문자열초기화 빈문자열 =""
		int inv_sum, kor_sum=0, eng_sum=0, math_sum=0; //숫자열초기화 =0
		
		final int MAX=3;
		
		Scanner sc = new Scanner(System.in); //입력을 위해 동적메모리 new 연산자이용
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
				System.out.println("이름: "+name+"국어: "+kor_score+"영어: "+eng_score+"수학: "+math_score+"개인평균: "+inv_avg+" "+result);
					kor_sum += kor_score;
					eng_sum += eng_score;
					math_sum += math_score;
			}
			//과목별 평균 구하기
			kor_avg = kor_sum /(double) MAX;
			eng_avg = eng_sum /(double) MAX;
			math_avg = math_sum/(double) MAX;
					
					System.out.println("국어점수 평균:" + kor_avg);
					System.out.println("영어점수 평균:" + eng_avg);
					System.out.println("수학점수 평균" + math_avg);
		}
		
		
	}


