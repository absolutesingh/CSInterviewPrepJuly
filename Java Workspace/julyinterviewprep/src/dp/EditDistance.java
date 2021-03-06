package dp;

public class EditDistance {
	static int edit(String s1, String s2, int m,int n)
	{
		if(m==0) return n;
		if(n==0) return m;
		
		if(s1.charAt(m-1) == s2.charAt(n-1))//If last characters equal
		{
			return edit(s1,s2,m-1,n-1);
		}
		//if last characters not equal ->
//		int replace = 1 + edit(s1,s2,m-1,n-1);
//		int insert = 1 + edit(s1,s2,m,n-1);
//		int delete = 1 + edit(s1,s2,m-1,n);
		
		return 1 + Math.min(edit(s1,s2,m-1,n-1),
				Math.min(edit(s1,s2,m,n-1), edit(s1,s2,m-1,n)));
	}
	static int editM(String s1, String s2, int m,int n,int dp[][])
	{
		if(m==0) return n;
		if(n==0) return m;
		if(dp[m][n]!=0) return dp[m][n];
		if(s1.charAt(m-1) == s2.charAt(n-1))//If last characters equal
		{
			return editM(s1,s2,m-1,n-1,dp);
		}
		//if last characters not equal ->
//		int replace = 1 + edit(s1,s2,m-1,n-1);
//		int insert = 1 + edit(s1,s2,m,n-1);
//		int delete = 1 + edit(s1,s2,m-1,n);
		
		dp[m][n] = 1 + Math.min(editM(s1,s2,m-1,n-1,dp),
				Math.min(editM(s1,s2,m,n-1,dp), editM(s1,s2,m-1,n,dp)));
		
		return dp[m][n];
	}
	static int editT(String s1, String s2, int m,int n)
	{
		if(m==0) return n;
		if(n==0) return m;
		int dp[][] = new int[m+1][n+1];
		for(int i=0;i<m+1;i++)
		{
			for(int j=0;j<n+1;j++)
			{
				if(i==0)
				{
					dp[i][j] = j;
				}
				else if(j==0)
				{
					dp[i][j] = i;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) //If last characters equal
				{
					dp[i][j] = dp[i-1][j-1];
				}
				else {
					dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
				}
			}
		}
		return dp[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sunday";
		String s2 = "saturday";
		int m = s1.length();
		int n = s2.length();
		int dp[][] = new int[m+1][n+1];
		System.out.println(editM(s1,s2,m,n,dp)); //Memoized
		System.out.println(editT(s1,s2,m,n)); //Tabulated
		System.out.println(edit(s1,s2,m,n)); //Recursive
		
	}

}
