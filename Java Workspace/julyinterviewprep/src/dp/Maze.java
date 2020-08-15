package dp;

public class Maze {
	static int findMazePath(int sr,int sc,int dr, int dc)
	{
		if(sr==dr && sc==dc)
		{
			return 1; //path found
		}
		if(sr>dr || sc>dc) return 0; //Path cannot be found/Out of array
		
		return findMazePath(sr,sc+1,dr,dc) + findMazePath(sr+1,sc,dr,dc);
	}
	static int findMazePathM(int sr,int sc,int dr, int dc, int dp[][])
	{
		if(sr==dr && sc==dc)
		{
			return 1; //path found
		}
		if(sr>dr || sc>dc) return 0; //Path cannot be found/Out of array
		if(dp[sr][sc]!=0) return dp[sr][sc];
		dp[sr][sc] = findMazePathM(sr,sc+1,dr,dc,dp) + findMazePathM(sr+1,sc,dr,dc,dp);
		return dp[sr][sc];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 20;//Indexes
		int n = 20;//Indexes
		//Array size -> m+1,n+1
//		System.out.println(findMazePath(0,0,2,3));
		int dp[][] = new int[m+1][n+1];
		System.out.println(findMazePathM(0,0,m,n,dp));
	}

}
