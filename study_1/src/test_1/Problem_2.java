package test_1;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minute;
		
		System.out.println("분을 입력하세요. (1분 이상 60분 이하 입력)");
		minute = sc.nextInt();
		
		
		if (minute <= 60 && minute >= 1) {
			System.out.printf("%d minute is %d seconds", minute, minute*60);
		}
		else {
			System.out.println("입력값을 벗어났습니다.");
		}
		

	}

}
