package week03_package;


public class NumException {
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "998", "3.141592"};
		int i;
		try {
			for(i=0; i<4; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
			
		}catch (NumberFormatException e) {
			System.out.println("정수로 변환 불가!");
		}finally {
			System.out.println("No matter Errors catched!");
		}
		
		
	}

}

