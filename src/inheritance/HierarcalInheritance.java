package inheritance;   //7dec2023 & Thursday

class Emp{  //parent class
	int sal=100;
	void companyName() {  //fun
	System.out.println("infosys");
	}
}
class PermanentEmp extends Emp{   //child1
	int da =500,hra=34,ta=600;
	public PermanentEmp(int sal) { //constructor
		this.sal=da+hra+ta+sal;
		System.out.println("Salary of permanent emp "+this.sal);
	}
}
class Temp extends Emp{   //child2
	public Temp(int fsal) {  //constructor
		this.sal+=fsal;
		System.out.println("salary of temp: "+this.sal);
	}	
}
class Contract extends Emp{  //child3
	int fixrate=100;
	public Contract(int hr) {  //constructor
		sal= fixrate*hr;
		System.out.println("salary of contract "+sal);
	}
}
public class HierarcalInheritance {

	public static void main(String[] args) {
		PermanentEmp p= new PermanentEmp(4500);
		p.companyName();
		Temp t=new Temp(2500);
		t.companyName();
		Contract c=new Contract(5);
		c.companyName();

	}

}
