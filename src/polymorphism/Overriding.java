package polymorphism;

class Eat {
	public void preeti() {          //it is called overridden
		System.out.println("1234");
	}
}

class Divya extends Eat {
	@Override
	public void preeti() {          //overriding
		System.out.println("7654");
		 super.preeti();
	}
}

public class Overriding {

	public static void main(String[] args) {
//		Eat ov = new Eat();
//		ov.preeti();
//		Divya d = new Divya();
//		d.preeti();
		Eat e=new Divya();
		e.preeti();
	}
}
