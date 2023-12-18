package inheritance;
class Cat{   //parent
	public void eat() {    //method
		System.out.println("Cat is a parent");
	}
}
class Kitten extends Cat{   //child
	public void cute() {   //method
		System.out.println("kitten is cute");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Kitten k = new Kitten();
		k.cute();
		k.eat();
		Cat c=new Cat();
		c.eat();
		//c.cute();  here we can call only child
		

	}

}
