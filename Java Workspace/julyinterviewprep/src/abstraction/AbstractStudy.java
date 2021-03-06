package abstraction;
abstract class Car{//We cannot instantiate it, we cannot create objects of this class.
	int maxSpeed;
	abstract void accelerate();//Only Declared but not implemented
	//We will use them after overriding, They are created to force the child classes to override them
	abstract void brake();
}
abstract class BMW extends Car{
	void accelerate()
	{
		maxSpeed = 320;
		System.out.println("BMW is accelerating at: "+maxSpeed);
	}
//	void brake(){
//		System.out.println("BMW is braking");
//	}
}
class BMWNew extends BMW{
	void brake(){
		System.out.println("BMW is braking");
	}
}
abstract class A{ // An abstract class can exist without abstract methods
	//We won't be able to instantiate A
	int x = 10;
	void fun() //Abstract Class can have concrete methods
	{
		System.out.println("Hello I'm A");
	}
}
public class AbstractStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c = new Car(); Cannot instantiate abstract class
//		BMW b = new BMW();
//		b.accelerate();
//		b.brake();
		BMWNew bm = new BMWNew();
		bm.brake();
	}

}
