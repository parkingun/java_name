package study_2;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("a 값 입력하세요.");
		a = sc.nextInt();
		System.out.println("b 값 입력하세요.");
		b = sc.nextInt();
		System.out.println("c 값 입력하세요.");
		c = sc.nextInt();
		System.out.println("d 값 입력하세요.");
		d = sc.nextInt();
		
		
		if (a/b > c/d) {
			System.out.printf("%d %d %d %d", a, b, c, d);
			System.out.println("출력");
			System.out.println("1");
		}
		else if (a/b == c/d) {
			System.out.printf("%d %d %d %d", a, b, c, d);
			System.out.println("출력");
			System.out.println("0");
		}
		else {
			System.out.printf("%d %d %d %d", a, b, c, d);
			System.out.println("출력");
			System.out.println("-1");
		}

	}

}
