package oops;                               //8dec23

abstract class Fruit{   //parent
	abstract void display();  //abstract method
	void type() {         //non abstract method,concrete method
		System.out.println("orange");
	}
	static void seasonalfruit() {  //static method
		System.out.println("seasonal fruit");
	}
}
class Mango extends Fruit{

	@Override
	void display() {
		System.out.println("MANGO");
		}
	}

public class AbstractClass {

	public static void main(String[] args) {
//		Fruit m= new Mango();  //upcasting
//		m.display();
//		Mango mango= new Mango();
//		mango.display();
//		Fruit fref;  //call using ref
//		fref=mango;
//		fref.display();
//		mango.type();  //non abstract method
//		Mango.seasonalfruit();  //static method call using class
		Fruit m= new Mango();
		m.display();
		Fruit fref;
		Mango m1 =new Mango();
		fref= m1;
		fref.display();

	}

}
