package week03_HW;

public class Add {
	public static void main (String[]  args) {
		int i, sum = 0;
		
			for (i=0; i<args.length; i++) {
				try {
				sum +=  Integer.parseInt(args[i]);
				}catch(NumberFormatException e) { // default : return; watch out
					continue; //for 
				}
			}
			System.out.println(sum);
	}
}
