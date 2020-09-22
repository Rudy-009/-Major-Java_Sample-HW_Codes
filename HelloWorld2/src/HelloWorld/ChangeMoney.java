package HelloWorld;

import java.util.Scanner;

public class ChangeMoney {
	
	
	public static void main (String agrs[]) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int tmp;
		
		int fiftyTh = num/50000;
		tmp = num%50000;
		num %= 50000;
		int tenTh = tmp/10000;
		tmp = num%10000;
		num %= 10000;
		int fiveTh = tmp/5000;
		tmp = num%5000;
		num %= 5000;
		int oneTh = tmp/1000;
		tmp = num%1000;
		num %= 1000;
		int fiveHun = tmp/500;
		tmp = num%500;
		num %= 500;
		int oneHun = tmp/100;
		tmp = num%100;
		num %= 100;
		int fifty = tmp/50;
		tmp = num%50;
		num %= 50;
		int ten = tmp/10;
		tmp = num%10;
		num %= 10;
		int one = tmp;
		
		
		System.out.print("5만원권  "+ fiftyTh+"개 ");
		System.out.print("1만원권  "+ tenTh+"개 ");
		System.out.print("5천원권  "+ fiveTh+"개 ");
		System.out.print("1천원권  "+ oneTh+"개 ");
		System.out.print("500원 짜리"+ fiveHun+"개 ");
		System.out.print("100원 짜리"+ oneHun+"개 ");
		System.out.print("50원 짜리"+ fifty+"개 ");
		System.out.print("10원 짜리"+ ten+"개 ");
		System.out.print("1원 짜리"+ one+"개 ");
	}
	
	
	
}
