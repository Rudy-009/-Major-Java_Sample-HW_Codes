package week03_package;

public class SaleRevenue {
	public static void main (String argc[]) {
		int intArray[][] = {{90,90,110,110},{120,110,100,110},{120,140,130,150}};
		
		int i, a = 0, sum = 0;
		
		for(i = 0; i<intArray.length; i++) {
			for(a=0; a < intArray[i].length; a++) {
				sum += intArray[i][a];
			}
		}
		System.out.println("지난 3년간 매출 총액은" + sum + "이며 연평균 매출은 "+sum/intArray.length + "입니다.");
	}
}
