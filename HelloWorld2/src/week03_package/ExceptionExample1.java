package week03_package;
import java.util.*;

public class ExceptionExample1 {
	public static void main (String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividened = 0;
		
		System.out.print("나뉨수를 입력하시오.");
		dividened = rd.nextInt();
		System.out.print("나눗수를 입력하시오.");
		divisor = rd.nextInt();
		try {
			System.out.println(dividened+"를"+divisor+"로 나누면 몫은 "+dividened/divisor+"입니다.");
		}catch(ArithmeticException e) {
			
		}
		finally {
			System.out.println("No matter Error catched!");
			
		}
	}
}

//try-catch-finally
