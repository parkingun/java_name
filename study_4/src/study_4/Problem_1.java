package study_4;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("2~20 �ڿ��� �Է��ϼ���.");
		num1 = sc.nextInt();
		
		for (int row=1; row<=num1; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}

}
