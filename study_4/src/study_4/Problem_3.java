package study_4;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("2~20 자연수 입력하세요.");
		num1 = sc.nextInt();
		
		for (int row=1; row<=num1; row++) {
			for(int col=1; col<row; col++) {
				System.out.print(".");
			}
			for(int col=1; col<=num1-row+1; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}

	}

}






