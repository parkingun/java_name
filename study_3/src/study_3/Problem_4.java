package study_3;

import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan, num;
		
		System.out.println("구구단 단을 입력하세요");
		dan = sc.nextInt();

		
		for (int i=1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i );
		}

	}

}
