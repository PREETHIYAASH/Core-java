package array;

import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		int c[][]=new int[size][size];
		System.out.println("Enter elements of A matrix: ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of B matrix: ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				b[i][j]=sc.nextInt();
			}
		}
			System.out.println("My array elements:  ");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					c[i][j]=a[i][j]+b[i][j];
					System.out.println(c[i][j]+" ");
				}
				System.out.println();
			}
	}
}
