package study_2;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("a �� �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("b �� �Է��ϼ���.");
		b = sc.nextInt();
		System.out.println("c �� �Է��ϼ���.");
		c = sc.nextInt();
		System.out.println("d �� �Է��ϼ���.");
		d = sc.nextInt();
		
		
		if (a/b > c/d) {
			System.out.printf("%d %d %d %d", a, b, c, d);
			System.out.println("���");
			System.out.println("1");
		}
		else if (a/b == c/d) {
			System.out.printf("%d %d %d %d", a, b, c, d);
			System.out.println("���");
			System.out.println("0");
		}
		else {
			System.out.printf("%d %d %d %d", a, b, c, d);
			System.out.println("���");
			System.out.println("-1");
		}

	}

}
