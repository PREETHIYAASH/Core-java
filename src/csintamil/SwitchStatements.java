package csintamil;

public class SwitchStatements {

	public static void main(String[] args) {
		int a = 2;
		//(a==1) {
			//System.out.println("one");
		//}
		//else if(a==2){
			//System.out.println("two");
		//}
		//else {
			//System.out.println("other numbers");
		//} 
			//or
		switch (a){
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("other numbers");
					
		}

	}

}
