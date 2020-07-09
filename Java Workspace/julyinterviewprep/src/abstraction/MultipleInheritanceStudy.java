package abstraction;
interface M{
	int x = 10;
	void fun();
}
interface N{
	int x = 20;
	void fun();
}
interface O extends M,N
{
	void fun();
}
class C implements O // Multiple Inheritance in Java through interfaces
{
	public void fun()
	{
		System.out.println("Hi, I'm fun in C");
		System.out.println(M.x); //Ambiguity resolved using Fully  Qualified Name
		System.out.println(N.x);
	}
}
public class MultipleInheritanceStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.fun();
	}

}
