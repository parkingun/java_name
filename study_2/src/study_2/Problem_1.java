package study_2;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("ù��° ���� �Է��ϼ���.");
		num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("");
			System.out.println("���");
			System.out.println(">");
		}
		else if (num1 < num2) {
			System.out.println("");
			System.out.println("���");
			System.out.println("<");
		}
		else {
			System.out.println("");
			System.out.println("���");
			System.out.println("=");
		}

	}

}
