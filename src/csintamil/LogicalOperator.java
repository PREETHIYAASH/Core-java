package csintamil;

public class LogicalOperator {

	public static void main(String[] args) {
		int age =40;
		boolean registered=true;
//		if(age>=18) {
//			if(registered) {
//			System.out.println("you are eligible");
//		    }else {
//			System.out.println("you are not eligible");
//		    }
//		}else {
//			System.out.println("you are not eligible");
//			}
	   if(age>=18 && registered && age<=60) {
		   System.out.println("you are eligible");
	   }else {
		   System.out.println("you are not eligible");
	   }
	   }
}
