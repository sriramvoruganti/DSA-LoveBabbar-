package DSA;

//Union and Intersection of two sorted arrays



	// in this program we have given two sorted arrays , find their union and intersection
//	Input : arr1[] = {1, 3, 4, 5, 7}
//    		arr2[] = {2, 3, 5, 6} 
//	Output : Union : {1, 2, 3, 4, 5, 6, 7} 
 //    		Intersection : {3, 5}

	
	public class Practice7 {
		static int printUnion(int arr1[] ,int arr2[] , int m , int n) {
		int i = 0;
		int j =0;
		while (i<m && j<n) {
			if ( arr1[i] < arr2[j])
				System.out.print(arr1[i++]+ " ");
			
			else if (arr2[j] < arr1[i])
				System.out.print(arr2[j++] + " ");
			
			else {
				
				System.out.print(arr2[j++] + " ");
				i++;
				}
			
			
							}
		
		while (i < m)
			System.out.print(arr1[i++] + " ");
		while(j<n)
			System.out.print(arr2[j++] + " ");
		
		return 0;
		
		}
		
	
	public static void main(String args[])
	{
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		int m = arr1.length;
		int n = arr2.length;
		printUnion(arr1, arr2, m, n);
	}
}

	
	
	
	
	
	
	
	

