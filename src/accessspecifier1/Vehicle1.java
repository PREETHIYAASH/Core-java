package accessspecifier1;

public class Vehicle1 {
	protected int speed;;
	protected Vehicle1(int s) {   //constructor
		speed=s;
	}
	
    // protected method
    protected void display() {  //method
        System.out.println("Vehicle class"+speed);
    }
}


