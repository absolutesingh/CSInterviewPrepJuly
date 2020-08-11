package dp;

public class LongestIncreasingSubsequence {
	static int globalmax = 1;
	static int LIS(int arr[],int n) //n is length
	{
		if(n==1) return 1; // Base Case
		int max_ending_here = 1;
		for(int i=1;i<n;i++)
		{
			int res = LIS(arr,i); // This is arr, length
			if(arr[n-1]>arr[i-1])
			{
				if(1+res>max_ending_here)
				{
					max_ending_here = 1+res;
				}
			}
		}
		//max_ending_here found
		
		if(max_ending_here>globalmax)
		{
			globalmax = max_ending_here;
		}
		return max_ending_here;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,22,9,33,21,50,41,60,80};
		int n = arr.length;
		LIS(arr,n);
		System.out.println(globalmax);
	}

}
