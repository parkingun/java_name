package test_1;

import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int width, height;
		
		System.out.println("가로를 입력하세요.");
		width = sc.nextInt();
		System.out.println("높이를 입력하세요.");
		height = sc.nextInt();
		
		System.out.printf("삼각형 넓이 = %.2f", (float)width*height/2);
	}

}
