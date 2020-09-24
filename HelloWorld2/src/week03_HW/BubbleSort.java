package week03_HW;
import java.util.*;

public class BubbleSort {
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		int[] array = new int[10];
		int i, b, tmp;
	
		for(i = 0; i <=9; i++) {
			array[i] = num.nextInt();
		}
		
		//bubble sort
		//compare n & n+1
		//if arr[n] > arr[n+1] => switch
		
		for(i=0; i < array.length-1; i++) {
			for(b=0; b < array.length-i-1; b++) {
				if(array[b] > array[b+1]) {
					tmp = array[b];
					array[b] = array[b+1];
					array[b+1] = tmp;
				}
				
			}
		}
		for(i = 0; i <=9; i++) {
			System.out.println(array[i]);
		}
		num.close();
	}
}
