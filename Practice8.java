package DSA;


	//Cyclically left rotate an array by one
	
	// Example :
	// N = 5
	//A[] = {1,2,3,4,5}
	// Output:
	// 2,3,4,5,1
	
public class Practice8 {	
	public static void main (String [] args) {
		 int A[] = {1,2,3,4,5};
		 int temp = A[0];
		 for ( int i = 1 ; i< A.length;i++) {
			// Here we store the first element in the temp variable
			
			 A[i-1] = A[i];
			  
		 									  }
		A[A.length-1] = temp;
		
		
		for(int i : A) {
			System.out.print(i);
			
		
					   }
		
		
											}
					}
	
	
	
	


