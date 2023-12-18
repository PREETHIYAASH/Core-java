package csintamil;

import java.util.Scanner;

public class BuildingSimpleCalculation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			double a = sc.nextDouble();
			
			System.out.println("Enter second number");
			double b =  sc.nextDouble();
			
			double c= a+b;
			System.out.println("Total number is "+c);
		}
				

	}
	

}

