package operatorex;

import java.util.Scanner;

public class XPyramid {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					//System.out.print("* ");
					System.out.printf("%d",i);
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
