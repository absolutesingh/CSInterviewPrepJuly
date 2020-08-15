package exceptions;
class InvalidAgeException extends Exception //user defined exception
{
	InvalidAgeException(String str) //Message
	{
		super(str);
	}
	public String toString()//Overridding toString Function
	{
		return (getClass().getName()+": *"+getMessage()+"*");
	}
}
public class UserDefinedException {
	static void checkAge(int age)
	{
		try {
			if(age<18)
			{
				throw new InvalidAgeException("Age must be >=18");
			}
			else {
				System.out.println("Eligible");
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e); //toString Function will be called;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);
		checkAge(20);
	}

}
