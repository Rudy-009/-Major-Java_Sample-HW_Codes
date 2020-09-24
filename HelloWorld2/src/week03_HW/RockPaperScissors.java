package week03_HW;

import java.util.*;
import java.io.*;


public class RockPaperScissors {
	public static void main (String[] args) {
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
		Scanner str = new Scanner(System.in);
		Random rd = new Random();
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String rps; 
			rps = str.nextLine(); //압력에서 문제가 있는 듯 하다.
			int rpsN = 4;
			if(rps == "그만") {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if( rps.equals("바위"))
				rpsN = 0;
			else if( rps.equals("보"))
				rpsN = 1;
			else if( rps.equals("가위"))
				rpsN = 2;
		///////////////////////////////
			int num = rd.nextInt(3);
			if(rpsN == 0) {
				System.out.print("사용자 = 바위, ");
				if(num == 0) {
					System.out.println("컴퓨터 = 바위, 비겼습니다.");
				}
				else if(num == 1) {
					System.out.println("컴퓨터 = 보, 사용자가 졌습니다.");
				}
				else if(num == 2) {
					System.out.println("컴퓨터 = 가위, 사용자가 이겼습니다.");
				}
			}
			
			else if(rpsN == 1) {
				System.out.print("사용자 = 보, ");
				if(num == 0) {
					System.out.println("컴퓨터 = 바위, 사용자가 이겼습니다.");
				}
				else if(num == 1) {
					System.out.println("컴퓨터 = 보, 비겼습니다.");
				}
				else if(num == 2) {
					System.out.println("컴퓨터 = 가위, 사용자가 졌습니다.");
				}
			}
			
			else if(rpsN == 2) {
				System.out.print("사용자 = 가위, ");
				if(num == 0) {
					System.out.println("컴퓨터 = 바위, 사용자가 졌습니다.");
				}
				else if(num == 1) {
					System.out.println("컴퓨터 = 보, 사용자가 이겼습니다.");
				}
				else if(num == 2) {
					System.out.println("컴퓨터 = 가위, 비겼습니다.");
				}
			}
			else {
				System.out.println("올바른 문자열을 입력하세요.");
			}
			
		}
		str.close();
	}
}
