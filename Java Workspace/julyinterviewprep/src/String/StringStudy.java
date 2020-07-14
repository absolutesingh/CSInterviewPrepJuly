package String;

public class StringStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "CipherSchools";
		String s2 = "CipherSchools";
		String s3 = new String("CipherSchools");
		String s4 = new String(s3);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1==s2); //== operator checks the reference.
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));//.equals checks value
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		char arr[] = {'J','A','V','A'};
		String ss = new String(arr);//Constructor overloading ka faayda
		System.out.println(ss);
		String s5 = new String(arr,0,2); //(Char Array, startIndex,Count)
		System.out.println(s5);
		System.out.println(s5.length());//Length of string
		byte barr[]= {65,66,67,68}; 
		String sb = new String(barr,2,2);//Byte Array to String
		System.out.println(sb);
		String sentence = "My Name is Khan";
		String sarr[] = sentence.split(" ");
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i]);
		}
		System.out.println(s1.indexOf('h')); //First occurrence of character
		System.out.println(s1.indexOf('q'));//-1 if not present
		System.out.println(s1.indexOf("Sch"));
		System.out.println(s1.toLowerCase()); //LowerCase
		System.out.println(s1.toUpperCase());//UpperCase
		System.out.println(s1.substring(0,6));//(startIndex, endIndex-1)
		System.out.println(s1.substring(6));
		System.out.println(s1.charAt(2));//Return character at a particular index
		System.out.println(s1.charAt(s1.length()-1));	
		System.out.println(s1.charAt(0));
		//String to Char array
		char carr[] = s1.toCharArray();
		for(int i=0;i<carr.length;i++)
		{
			System.out.print(carr[i]+" ");
		}
		System.out.println();
		String blank = "";
		System.out.println(blank.isEmpty());
		String dict1 = "AA";
		String dict2 = "BD";
		//Lexicographically - According to the dictionary order
		System.out.println(dict1.compareTo(dict2));
		String jv = "Java";
//		jv=jv+" Programmers";
//		System.out.println(jv); // Concatenation
		System.out.println(jv.concat(" Programmers"));
		String faltu = "       Text      ";
		System.out.println(faltu);
		faltu = faltu.trim(); // Remove unnecessary spaces from start and end of a string.
		System.out.println(faltu);
		System.out.println(s1.replace('o', '*'));
		System.out.println(sentence.replaceAll("My", "Your")); 
		int x = 10;
		//Other DataType to String
//		String sx = x+"";
		String sx = String.valueOf(x);
		System.out.println(sx);
		
	}

}
