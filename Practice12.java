package DSA;

public class Practice12 {
	public  static int maxprofit(int[] a) {
		int maxprofit =0;
		int minsofar = a[0];
		for (int i =0; i<a.length ; i++){
			minsofar = Math.min(minsofar,a[i]);
			int Profit = a[i] - minsofar;
			maxprofit = Math.max(maxprofit, Profit);
			
		}
		return maxprofit;
		
		
		
	}

	
	public static void main(String args[]) {
		
		int a[] = {7,1,5,3,6,4};
		System.out.print(maxprofit(a));
		
		
	}
	
	
	
}
