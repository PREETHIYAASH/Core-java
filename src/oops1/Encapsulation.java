package oops1;

class Learner1{
	private int rollno;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String name;
	private String insName="Edubridge";
	public String getInsName() {  //getter &setter for insname
		return insName;
	}
	public void setInsName(String insName) {
		this.insName = insName;
	}
	int bal=1000;
	int cal=456;
	public int getRollno() {   //getter &setter for rollno
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {   //getter &setter for name
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Learner1() {
		//constructor
	}
	public Learner1(int rollno,String name) {  // parameterized constructor
		super();
		rollno=123;
		name="srtyu";
		this.rollno=rollno;
		this.name=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {  //read only-apply only getter,write only
		Learner1 l=new Learner1();
		l.setName("priya");  //used to read and 
		l.setRollno(67);
		System.out.println("name: "+l.getName()+" RollNo: "+l.getRollno()+" "
				+ "Institute "+l.getInsName());
		Learner1 l1=new Learner1(34,"preeti");
		System.out.println("Name: "+l1.getName()+" Rollno: "+l1.getRollno());
		l1.setName("pooja");
		System.out.println("Name: "+l1.getName()+" Rollno: "+l1.getRollno());
		l.bal=l.bal+1000;
		System.out.println(l.bal);
		System.out.println(l.getName());  //ouside class we can access using getter
		System.out.println(l.cal);
	}

}
