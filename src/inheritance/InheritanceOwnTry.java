package inheritance;

interface House{
	Void room1();
}
interface Kitchen1 {
	void room2();
}
interface Bedroom{
	void room3();
}
interface Prayerhall {
	
	void room4();
}
class Hall implements House,Kitchen1,Bedroom,Prayerhall{

	@Override
	public void room4() {
		System.out.println("room4");
		
	}

	@Override
	public void room3() {
		System.out.println("room3");
		
	}

	@Override
	public Void room1() {
		System.out.println("room1");
		return null;
	}

	@Override
	public void room2() {
		System.out.println("room2");
	}
}
class Corridor extends Hall{
	
}

public class InheritanceOwnTry {

	public static void main(String[] args) {
		Corridor cc =new Corridor();
		cc.room1();
		cc.room2();
		cc.room3();
		cc.room4();

	}

}
