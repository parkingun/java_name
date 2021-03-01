package study_4;

import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("홀수 5 ~ 19 자연수 입력하세요.");
		num = sc.nextInt();
		
		
		for (int a=1; a<=5; a++) {
			if(a%2==1) {
				for (int b=1; b<=num; b++) {
					System.out.print("*");	
				}
				System.out.println();			
				}
			
			else {
				for(int c=1; c<=(num-3)/2; c++) {
					for(int j=1; j<=num-1; j++) {
						System.out.print(" ");
					}
					System.out.println("*");
				}
			}
		}
	}

}
