package test_1;

import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("1��° �ڿ���");
		a = sc.nextInt();
		System.out.println("2��° �ڿ���");
		b = sc.nextInt();
		
		
		System.out.printf("%d + %d = %d", a, b, a+b);
		System.out.println();
		System.out.printf("%d - %d = %d", a, b, a-b);
		System.out.println();
		System.out.printf("%d * %d = %d", a, b, a*b);
		System.out.println();
		System.out.printf("%d / %d = %d", a, b, a/b);
		System.out.println();
		System.out.printf("%d ������ %d�� ������ = %f", a, b, (float)a%b);
		System.out.println();
	}

}