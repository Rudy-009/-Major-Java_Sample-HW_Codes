package week03_package;

import java.util.Scanner;

public class ArrayLength {
	public static void main (String argc[]) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int i;
		
		int len = arr.length;
		
		for(i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		
		double sum = 0.0;
		for(i=0; i<len; i++) {
			sum += (double)arr[i];
		}
		
		
		System.out.print("입력된 수의 평균 "+(sum/len)+"입니다.");
	}
}
