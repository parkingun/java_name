package test_1;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minute;
		
		System.out.println("���� �Է��ϼ���. (1�� �̻� 60�� ���� �Է�)");
		minute = sc.nextInt();
		
		
		if (minute <= 60 && minute >= 1) {
			System.out.printf("%d minute is %d seconds", minute, minute*60);
		}
		else {
			System.out.println("�Է°��� ������ϴ�.");
		}
		

	}

}