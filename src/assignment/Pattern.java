package assignment;

public class Pattern {

	public static void main(String[] args) {
		int a=3;
		int b=2;
		int c=4;
		 for (int i=1;i<=a;i++) {
			 for ( int j=1;j<=a-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
		 for (int i=1;i<=b;i++) {
			 for ( int j=1;j<=b-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
		 
		 
		 for (int i=1;i<=c;i++) {
			 for ( int j=1;j<=c-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }

	}

}
