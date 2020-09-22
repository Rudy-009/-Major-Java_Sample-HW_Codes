package HelloWorld;
import java.util.*;

public class ScannerExam {
	
	
	public static void main(String[] args) { //메소
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		System.out.println("당신의 나이는 " + age + "살입니다.");
		System.out.println("당신의 체중은 " + weight + "kg입니다.");
		System.out.println("당신의 신장은 " + height + "cm입니다. ");
		
	
	}

}
