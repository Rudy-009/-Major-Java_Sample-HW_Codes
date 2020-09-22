package week03_package;
import java.util.*;

public class Q03_01 {
	public static void main (String argc[]) {
		int i;
		int sum = 0;
	
		for (i=1; i < 11; i++) {
			sum += i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			}
		}
		System.out.print("="+sum);
	}
}
