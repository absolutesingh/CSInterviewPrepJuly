package AccessModifiersTwo;
import AccessModifiersOne.A;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
//		System.out.println(obj.x); // Default is not visible outside the package
		System.out.println(obj.y);
//		System.out.println(obj.z); //Protected not accessible here
	}

}
