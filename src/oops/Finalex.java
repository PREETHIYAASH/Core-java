package oops;
class Parent1{
	 void display() {
		System.out.println("Parent class final method");
	}
}
public class Finalex extends Parent1{//we declare any class as a final, we can not extend.
	 int a=10;//we can not change value
		void display() {//we can not override final method
		
		System.out.println("tfsag");

		}
		
	public static void main(String[] args) {
		Finalex f=new Finalex();
		f.a=15;
		f.display();
		
		Parent1 m=new Finalex();
		m.display();
	}

}


