package study_2;

import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		int r, e, c;
			
		System.out.println("입력");
		r = sc.nextInt();
		e = sc.nextInt();
		c = sc.nextInt();
			
		if (r>e && r>c) {
			System.out.println("출력");
			System.out.println("do not advertise");
		}
		else if (r>e && r<c) {
			System.out.println("출력");
			System.out.println("advertise");
		}
		else {
			System.out.println("출력");
			System.out.println("do not matter");
		}
	}

}
