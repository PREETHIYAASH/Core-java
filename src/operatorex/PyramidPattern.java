package operatorex;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		int i,j,k;
		int row;
		Scanner s= new Scanner(System.in);
		row=s.nextInt();
		for(i=1;i<=row;i++) {   //outer for loop for rows
			for(j=1;j<=row-i;j++) {   //inner for loop-column
				System.out.print(" "); //ow to debug
			}
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
