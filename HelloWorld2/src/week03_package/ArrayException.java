package week03_package;

public class ArrayException {
	public static void main (String[] args) {
		
		int[] intArray = new int[5];
		int i;
		intArray[0] = 0;
		
		try {
			for(i=0; i<5; i++) {
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of bounds");
		}
		
		
	}
}
