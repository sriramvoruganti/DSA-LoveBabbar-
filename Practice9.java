package DSA;
//Kadane's algorithm
public class Practice9 {
	
	public static void main (String args[]) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.print("The maximum value of the array is :  " + maxsumsubarray(a));
			
											}
	
	

	static int maxsumsubarray(int a[]) {
		int maxsum = 0;
		int cursum = 0;
		
		for (int i = 0; i < a.length-1 ; i++) {
			cursum = cursum + a[i];
			
			if (cursum > maxsum) {
				maxsum = cursum;
			
								}
			
			if (cursum < 0) {
				cursum = 0;
				
							}
			
			
		}
		
		return maxsum;

		
		
		
	}

	
}
