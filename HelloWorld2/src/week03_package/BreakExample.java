package week03_package;
import java.util.*;

public class BreakExample {
	public static void main (String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num,i=0;
		
		while(true) {
			num = scan.nextInt();
			if(num == -1) {
				break;
			}
			i++;
		}
		System.out.print("입력된 숫자 개수는 "+i);
	}

}
