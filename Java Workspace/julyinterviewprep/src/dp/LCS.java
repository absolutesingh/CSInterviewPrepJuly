package dp;

public class LCS {
	static int doLCS(String s1, String s2, int m,int n)
	{
		if(m==0 || n==0)
		{
			return 0;
		}
		if(s1.charAt(m-1) == s2.charAt(n-1))
		{
			return 1 + doLCS(s1,s2,m-1,n-1);
		}
		return Math.max(doLCS(s1,s2,m,n-1), doLCS(s1,s2,m-1,n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCGKH";
		String s2 = "AEKFHR";
		System.out.println(doLCS(s1,s2,s1.length(),s2.length()));
	}

}
