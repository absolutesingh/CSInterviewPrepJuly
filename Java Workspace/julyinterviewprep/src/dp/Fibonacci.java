package dp;

public class Fibonacci {
	static int fib(int n) //Recursive Approach
	{
		if(n==0 || n==1) return n;
		int a = fib(n-1);
		int b = fib(n-2);
		int ans = a+b;
		return ans;
	}
	static int fibM(int n, int storage[]) //Memoization
	{
		if(n==0 || n==1) return n;
		if(storage[n]!=0) return storage[n]; //Step 3-> Return value if already calculated
		int a = fibM(n-1,storage);
		int b = fibM(n-2,storage);
		int ans = a+b;
		storage[n] = ans; //Step 2 -> Store in the array
		return ans;
	}
	static int fibT(int n) //Tabulation
	{
		int storage[] = new int[n+1];
		storage[0] = 0;
		storage[1] = 1;
		for(int i=2;i<=n;i++)
		{
			storage[i] = storage[i-1] + storage[i-2];
		}
		//array filled
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int n= 45;
//		System.out.println(fib(n));
		int storage[] = new int[n+1];
//		System.out.println(fibM(n,storage));
		System.out.println(fibT(n));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
