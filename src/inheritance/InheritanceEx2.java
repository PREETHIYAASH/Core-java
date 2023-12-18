package inheritance;

class Father1{
	String fname="fdgd";
}
class Daughter extends Father1{
	String dname="pooja";
	void display() {
		System.out.println("father name "+fname);
		System.out.println("daughter name "+dname);
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.display();
		d.fname="jesus";
		d.dname="priya";

	}

}
