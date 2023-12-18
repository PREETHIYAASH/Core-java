package oops;
abstract class Bird{
	abstract void makesound();
}
class Duck extends Bird{

	@Override
	void makesound() {
		System.out.println("duck sounds like quak quak");
		
	}
	
}
class Peacock extends Bird{

	@Override
	void makesound() {
		System.out.println("peacock sounds like scream");
		
	}
	
}

public class AbstractEx {

	public static void main(String[] args) {
		Duck d=new Duck();
		d.makesound();
		Peacock p=new Peacock();
		p.makesound();

	}

}
