package study_2;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("첫번째 수를 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("");
			System.out.println("출력");
			System.out.println(">");
		}
		else if (num1 < num2) {
			System.out.println("");
			System.out.println("출력");
			System.out.println("<");
		}
		else {
			System.out.println("");
			System.out.println("출력");
			System.out.println("=");
		}

	}

}
