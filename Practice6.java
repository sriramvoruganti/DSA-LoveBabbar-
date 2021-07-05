package DSA;


//Move all negative numbers to the beginning  and positive to the end with constant extra space
// In this program we basically work on the sorting of negative and positive numbers


public class Practice6 {
	public static void main(String[] args) {
		int arr[] = {-1,-20,30,40,50,-8};
		int newArr[] = new int[arr.length];
		rearrange(arr, arr.length , newArr);
		print(newArr);
		
		
		
	}

	private static void print(int[] newArr) {
		// TODO Auto-generated method stub
		for(int i: newArr) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		
	}

	private static void rearrange(int[] arr, int length, int[] newArr) {
		// TODO Auto-generated method stub
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i] >0) {
				newArr[j] = arr[i];
				j++;
						   }
			
									   }
		
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i] < 0) {
				newArr[j] = arr[i];
				j++;
				
						    }
										}
		
		
		
		
																		}	
	
	
	

}
