package study_3;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("100이하 자연수 입력하세요.");
		num1 = sc.nextInt();
		
		for (int i=1; i<=num1; i++) {
			System.out.print("*");
		}
	}

}
