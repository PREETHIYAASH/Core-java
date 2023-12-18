package oops;

public class MetodOverloading2 {
	public void join(String s,String s1) {     //first method 
		//String ss=s.concat(s1);
		System.out.println(s.concat(s));
		
	}
	public void join(String s,String s1,String s2) {   //
		System.out.println(s.concat(s1.concat(s2)));  //datatype overloading
		
	}
	public static void main(String[] args) {
		MetodOverloading2 mol = new MetodOverloading2();
		mol.join("divya", "priya");
		mol.join("divya", "priya","preeti");

	}

}
