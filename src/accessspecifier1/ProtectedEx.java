package accessspecifier1;
//import accessspecifier.Vehicle1;


class Bike extends Vehicle1{
	String nm;
	protected Bike(int s,String name) {
		super(s);
		nm=name;
		// TODO Auto-generated constructor stub
	}
	void dis() {
		display();
		System.out.println( " name: "+nm);
	}
	
}
public class ProtectedEx {

	public static void main(String[] args) {
		Bike b=new Bike(100,"Honda");
		b.dis();
//		Vehicle1 v=new Vehicle1(100);//we can not access protected constructor in another package non sub class

	}

}


