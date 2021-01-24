package study_2;

import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c, d, e, f, g, a, h, C;
		
		System.out.println("c, d, e, f, g, a, h, C 입력");
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		g = sc.nextInt();
		a = sc.nextInt();
		h = sc.nextInt();
		C = sc.nextInt();
		
		
		if (c<d && d<e && e<f && f<g && g<a && a<h && h<C) {
			System.out.println("출력");
			System.out.println("ascending");
		}
		else if (c>d && d>e && e>f && f>g && g>a && a>h && h>C) {
			System.out.println("출력");
			System.out.println("descending");
		}
		else {
			System.out.println("출력");
			System.out.println("mixed");
		}

	}

}
