package week03_HW;

public class Average {
	public static void main (String[] args) {
		
		int len = args.length, i, sum=0;
		
		for(i=0 ; i<len; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		double ave = (double)sum/len;
		System.out.println(ave);
	}
}
