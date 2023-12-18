package superkeyword;

class Animal{   //parent
    String type;
	public Animal() { //constructor
		System.out.println("Parent Default Constructor");
	}
	public Animal(String type) {  //parameterized constructor
		this.type=type;
		System.out.println(this.type);
	}
}
class Tiger extends Animal{   //child
	String color;
	public Tiger() { //constructor
		super();
		System.out.println("Child default constructor");
	}
	public Tiger(String type,String color) {
		this.color=color;
		System.out.println(this.color);	
	}
}


public class SuperAsConstructor {

	public static void main(String[] args) {
		Tiger t= new Tiger();
		Tiger t1=new Tiger("Wild","Orange");

	}

}
