package study_3;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2;
		
		System.out.println("첫번째 자연수 입력(100이하)");
		num1 = sc.nextInt();
		System.out.println("두번째 자연수 입력(100이하)");
		num2 = sc.nextInt();
		
		for (int i=num1; num1<=num2; num1++) {
			System.out.printf("%d ", num1);
		}

	}

}






