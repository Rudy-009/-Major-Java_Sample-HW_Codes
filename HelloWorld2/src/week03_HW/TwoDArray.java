package week03_HW;
import java.util.*;

public class TwoDArray {
	public static void main (String[] args) {
		
		int intArray[][] = new int[4][4];
		int i, a;
		for(i=0; i<4; i++) // memberset 0
			for(a=0;a<4;a++)
				intArray[i][a] = 0;
		
		Random rd = new Random();
		
		for(i=0; i<8; i++) {
			int val = rd.nextInt(9);// 0~8
			int idx = rd.nextInt(16);//0~15
			if(intArray[idx/4][idx%4] == 0 && val>0) {	
				intArray[idx/4][idx%4] = val;
			}
			else
				i--;
		}
		
		for(i=0; i<4; i++) {
			for(a=0;a<4;a++) {
				System.out.print(intArray[i][a]+" ");
			}
			System.out.println("");
		}
	}
}
