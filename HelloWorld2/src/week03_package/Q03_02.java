package week03_package;
import java.util.*;

public class Q03_02 {
	public static void main (String argc[]) {
		Scanner scan = new Scanner(System.in);
		
		double num = 1.0;
		double sum = 0.0;
		int i = 0;
		while(num != 0) {
			num = scan.nextInt();
			sum += num;
			i++;
			
		}	
		System.out.print( "입력된 개수는 "+(i-1)+"개이며 "+"평균은 " +sum/(i-1)+"입니");
	}
}
