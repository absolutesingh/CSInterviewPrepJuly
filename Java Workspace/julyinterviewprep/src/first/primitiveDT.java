package first;

public class primitiveDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Java is not purely object oriented because primitive DataTypes are not objects.
//We can Create objects from them using the Wrapper Classes.
		int x = 5;
		int y = 10;
		int z = x + y;
		//+ -> Operator
		//x,y -> Operands
		System.out.println(z);
		byte a = 10;
		int b = a;// Implicit Type Casting or Widening or Up-Casting
		System.out.println(b);
		int c = 25;
		byte d = (byte)c;//Explicit Type Casting or Narrowing or Down-Casting
		System.out.println(d);
		int e = 130;
		byte f = (byte)e;
		System.out.println(f);
//		float ft = 5.5f;
		float ft = (float) 5.5;
		double db = 10.5;
		System.out.println(ft);
		System.out.println(db);
		char ch = 'a';
		System.out.println(ch);
		//Task - 1: Different Ways to Convert Character to int, A - 65, a- 97
	}

}
