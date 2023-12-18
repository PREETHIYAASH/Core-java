package oops;

abstract class Math {
	void display(int num1, int num2) {
		System.out.println("add: " + (num1 + num2));
	}
}

class Add extends Math {

	@Override  //runtime polymorphism  //compile polymorpism-overload
	void display(int num1, int num2) {
		super.display(num1, num2);
	}
  
}
public class Overriding2 {

	public static void main(String[] args) {
		Math a = new Add();
		a.display(10,20);
	}

}
