package exceptions;

public class Handling {
	static void fun() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Inside fun");
		throw new ArrayIndexOutOfBoundsException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c;
		try {
			fun();
//			c = a/b;
//			System.out.println(c);
//			int arr[] = new int[5];
//			System.out.println(arr[5]);
//			throw new ArrayIndexOutOfBoundsException(); //Throw an exception
		}
		//At a time only 1 exception will be catched
//		catch(Exception e)
//		{
//			System.out.println("Handling all exceptions");
//		}
		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
			System.out.println("Please input correct values: ");
			b = 10;
			c=a/b;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("Check Array size");
		}
		finally
		{
			System.out.println("Inside Finally Block. I am the boss, I will run everytime.");
		}
		System.out.println("This line is very important. Run this");
	}

}
