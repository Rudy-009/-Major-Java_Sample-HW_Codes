package week03_package;

public class ContinueExample {
	public static void main (String argc[]) {
		int sum = 0, i;
		
		for(i=0; i<101; i++) {
			if((i%2) == 1) {
				continue;
			}
			else {
				sum += i;
			}
		}
		
		System.out.print("1부터 100까지 짝수의 합은 "+sum);
	}

}
