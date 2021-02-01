package study_3;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("100이하 자연수 입력하세요.");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("%d ", i);
		}
	}

}
