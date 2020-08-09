package doubts;

public class AnotherPalindrome {
	static boolean checkPalindrome(String s)
	{
		int l = 0;
		int r = s.length()-1;
		while(l<r)
		{
			char a = s.charAt(l);
			char b = s.charAt(r);
			if(a=='?' || b=='?')
			{
				l++;
				r--;
				continue;
			}
			if(a!=b)
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ma?ayalax?";
		String s2 = "k???l???m";
		System.out.println(checkPalindrome(s1));
		System.out.println(checkPalindrome(s2));
		
	}
}