package july13;

public class Solution {
	static boolean isPrimeRam(int n)
	{
		if(n<=1) return false;
		if(n==2) return true;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0) return false;
		}
		return true;
	}
	static boolean isPrimeSham(int n)
	{
		if(n<=1) return false;
		if(n==2) return true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 38;
		if(n%2==0) //Remainder of a%b 
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		System.out.println(isPrimeRam(n));
		System.out.println(isPrimeSham(n));
	}

}
