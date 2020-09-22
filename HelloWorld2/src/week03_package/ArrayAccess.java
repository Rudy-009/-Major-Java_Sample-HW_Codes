package week03_package;
import java.util.*;

public class ArrayAccess {
	public static void main (String argc[]) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int i;
		
		for(i=0; i<5; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		for(i=0; i<5; i++) {
			if(arr[max]<arr[i]) {
				max = i;
			}
			else {
				continue;
			}
			
		}
		System.out.print("입력된 수에서 가장 큰 수는 "+arr[max]+"입니다.");
	}
}
