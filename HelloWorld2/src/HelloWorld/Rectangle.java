package HelloWorld;
import java.util.Scanner;

public class Rectangle {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if (x1 > x2) {
			int tmp = x1;
			x1 = x2;
			x2 = tmp;
		}
		if (y1 > y2) {
			int tmp = y1;
			y1 = y2;
			y2 = tmp;
		}
		
		//Let (50,50)&(100,100) square is S1 and input square is S2
		//one's square's point in the other square's area is only if two squares are overlapped
		
		boolean a1 = (x1 > 50)&&(x1 <100);
		boolean a2 = (x2 > 50)&&(x2 <100);
		boolean a3 = (y1 > 50)&&(y1 <100);
		boolean a4 = (y2 > 50)&&(y2 <100);
		
		boolean b1 = (x1 < 50)	&&	(x2 > 50);
		boolean b2 = (x1 < 100)	&&	(x2 > 100);
		boolean b3 = (y1 < 50)	&&	(y2 > 50);
		boolean b4 = (y1 < 100)	&&	(y2 >	100);
		
		
		if((a1||a2) && (a3||a4)) { //S2's point in the S1
			System.out.println("overlapped");
		}
		if((b1||b2)&&(b3||b4)) {
			System.out.println("overlapped");
		}
		
	}

}
