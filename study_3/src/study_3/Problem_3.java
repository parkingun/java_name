package study_3;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2;
		
		System.out.println("ù��° �ڿ��� �Է�(100����)");
		num1 = sc.nextInt();
		System.out.println("�ι�° �ڿ��� �Է�(100����)");
		num2 = sc.nextInt();
		
		for (int i=num1; num1<=num2; num1++) {
			System.out.printf("%d ", num1);
		}

	}

}






