package HelloWorld;

import java.util.*;

public class Casechanger {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		
		if (ch>=65 && ch<=90) {
			ch+=32;
			System.out.print(ch);
		}
		else if (ch>=97 && ch<=122) {
			ch-=32;
			System.out.print(ch);
		}
		else {
			System.out.print("영문자 아닙니다.");
		}
	}
}
