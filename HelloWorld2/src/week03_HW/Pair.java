package week03_HW;
import java.util.*;

public class Pair {
	public static void main (String[] args) {
		
		String course[] = {"java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score [] = {95,88,76,62,55};
		Scanner str = new Scanner(System.in);
		int i;
		
		while(true) {
			boolean bl = true;
			System.out.print("과목 이름>> ");
			String sear = str.next();
			
			if(sear.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			for(i=0; i<course.length ; i++) {
				if(sear.equals(course[i])) {
					System.out.println(sear+"의 점수는 "+score[i]);
					bl = false;
					break;
				}
			}
			
			if(bl) {
				System.out.println("없는 과목입니다.");
			}
		}
	}
}
