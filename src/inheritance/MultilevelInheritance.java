package inheritance;

class GrandFather{        //parentclass
	public void land() {  //function
		System.out.println("He own a land");
	}
}
class Father extends GrandFather{
	public void house() {
		System.out.println("He own a house");
	}
	
}
class Son extends Father{
	public void car() {
		System.out.println("He as a Audi car");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {  //in multilevel inheritance we sould call only last child(son) 
		Son s=new Son();
		s.land();
		s.house();
		s.car();
		Father f=new Father();
		f.land();
		f.house();
		GrandFather g=new GrandFather();
		g.land();
		
		}

}
