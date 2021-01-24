package study_2;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("입력");
		num = sc.nextInt();
		
		if (num==1 || num==3 || num==5) {
			System.out.println("출력");
			System.out.println("enjoy");
		}
		else {
			System.out.println("출력");
			System.out.println("입력 범위가 아닙니다.");
		}

	}

}






