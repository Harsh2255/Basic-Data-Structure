/* A Naive recursive implementation 
of 0-1 Knapsack problem */
class Knapsack { 


	
	static int max(int a, int b) 
	{ 
		return (a > b) ? a : b; 
	} 

	// Returns the maximum value that 
	
	static int knapSack( 
		int W, int wt[], 
		int val[], int n) 
	{ 
		// Base Case 
		if (n == 0 || W == 0) 
			return 0; 

		// If weight of the nth item is 
		// more than Knapsack capacity W, 
		// then this item cannot be included 
		//might an option
		if (wt[n - 1] > W) 
			return knapSack(W, wt, val, n - 1); 

		
		else
			return max( 
				val[n - 1] + knapSack(W - wt[n - 1], 
									wt, val, n - 1), 
				knapSack(W, wt, val, n - 1)); 
	} 

	// Driver program to test 
	
	public static void main(String args[]) 
	{ 
		int []val= new int[] { 60, 100, 120 }; 
		int []wt = new int[] { 10, 20, 30 }; 
		int W = 50; 
		int n = val.length; 
		System.out.println(knapSack(W, wt, val, n)); 
	} 
} 

