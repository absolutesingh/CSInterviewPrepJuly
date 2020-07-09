package encapsulation;
class Demo{
	private int a = 5;
	private int b = 10;
	private int c = 20; //Read-Only
	private int d = 25; //Write-Only
	public int getA() {
		System.out.println("Value of A read");
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	public void setA(int a)
	{
		if(a>100) {
			this.a = a;
		}
		else {
			System.out.println("Cannot Set Value");
			return;
		}
	}
	public void setB(int b)
	{
		System.out.println("Value of B Changed");//Logging the Changes
		this.b = b;
	}
	
	public int getC() {
		return this.c;
	}
	
	public void setD(int d) {
		this.d = d;
	}
	
}
public class EncapStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
