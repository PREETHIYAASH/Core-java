package inheritance; //youtube class

interface Controllable extends AI,MyLastInterface{
	void onleft();   //it is abstract method ,no need put abstract keyword in interface 
	void onright();
	void onabove();
	void onbelow();
}                                          //allows default method, static,abstract,constant variables(final)
interface AI{                              //default () released in java9
	void ml();
}
interface MyLastInterface{
	void robotover();
}
class Robot implements Controllable,AI{

	@Override
	public void onleft() {
		System.out.println("Robots turn left");
		
	}

	@Override
	public void onright() {
		System.out.println("Robots turn right");
		
	}

	@Override
	public void onabove() {
		System.out.println("Robots turn above");
		
	}

	@Override
	public void onbelow() {
		System.out.println("Robots turn below");
		
	}

	@Override
	public void ml() {
		System.out.println();
		}

	@Override
	public void robotover() {
		// TODO Auto-generated method stub
		
	}
	}
class Robot1 extends Robot{
	
}


public class Inheritance {

	public static void main(String[] args) {
		Robot1 r=new Robot1();
		r.ml();
		r.onabove();
		r.onbelow();
		r.onleft();
		r.onright();

	}

}
