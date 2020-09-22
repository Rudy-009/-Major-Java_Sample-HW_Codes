package HelloWorld;

import java.util.Scanner;

public class Triangle {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if( ((a+b) > c) && ((a+c) > b) && ((c+b) > a)){
			System.out.print("삼각형을 만들 수 있습니다.");
		}
		else {
			System.out.print("삼각형을 만들 수 없습니다.");
		}
	}
}
