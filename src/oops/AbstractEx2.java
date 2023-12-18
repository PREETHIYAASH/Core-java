package oops;      // sow eg
  
abstract class Mobile{
	Mobile(){
		System.out.println("constructor from abstract class");
	}
	void call() {
		System.out.println("We can make a phone call");
	}
	static void message() {
		System.out.println("we can send a msg");
	}
	abstract void camera();
	abstract void ram();
}
class Samsung extends Mobile{

	@Override
	void camera() {
		System.out.println("47 pixels");
		
	}

	@Override
	void ram() {
		System.out.println("4GB RAM");
		
	}
}
class Vivo extends Mobile{

	@Override
	void camera() {
		System.out.println("32 pixel");
		
	}

	@Override
	void ram() {
		System.out.println("6GB RAM");
		
	}
	
}
	
public class AbstractEx2 {

	public static void main(String[] args) {
		System.out.println("       samsung       ");
		Mobile m=new Samsung();  //upcasting
		Mobile.message();  //static call
		Mobile s;    //abstact call using ref
		s=m;
		s.call();
		s.camera();
		s.ram();
		System.out.println("    vivo    ");
		Mobile m1=new Vivo();
		Mobile.message();
//		Mobile s1;
//		s1=m1;
		m1.call();
		m1.camera();
		m1.ram();
		
		
		
		}

}
