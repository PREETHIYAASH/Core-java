package superkeyword;

class Vehicle1{    //parent class
	int speed=100;
	void display() {
		System.out.println("parent class");
		System.out.println("speed of veicle: "+speed);
	}
	void vType() {
		System.out.println("Four wheeler");
	}
}
class Car extends Vehicle1{
	int speed=120;
	void display() {
		vType();
		super.display();
		System.out.println("Speed of the vehicle: "+super.speed);
		System.out.println("Speed of car: "+speed);
	}
}

public class SuperAsVariable {

	public static void main(String[] args) {
		Car c=new Car();
		c.display();
		c.vType();
		}
}
