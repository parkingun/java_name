package study_3;

import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0, num;
		
		for (int i=1; i <= 7; i++) {
			System.out.printf("%d �ڿ����� �Է��ϼ��� \n", i);
			num = sc.nextInt();
			sum += num;
		}
		
		System.out.print(sum);

	}

}
