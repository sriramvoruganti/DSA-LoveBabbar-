package DSA;


	
//Here we understand Count Inversions in an Array
// Input arr[] = {8,4,2,1}
// Output =6
//Explanation: Given array has six inversions:
// (8,4),(8,2),(8,1),(4,2),(4,1),(2,1)
	
public class Practice11 {
	static int arr[] = new int[] {1,20,6,4,5};
// Brute Force Method
	static int getInvCount(int n)
	{
		int inv_count = 0 ;
		for (int i = 0 ; i<n-1 ; i++) // Increment i from 0 to 4
			for (int j = i+1 ; j<n ; j++) // Increment j from 1 to 5
				if (arr[i] > arr[j])
					inv_count++;
		
		
		return inv_count;
	
		
	}
	
	public static void main(String [] agrs) {
		
		System.out.print("Number of inversion" + " " +  getInvCount(arr.length));
		
		
		
	}

	
	
	
		
		
		
	}


