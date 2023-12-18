package iterativestatement;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		System.out.println("Enter te number");
		int d = no.nextInt();

		int temp = d;
		int sum = 0;
		while (d != 0) {
			temp = d % 10;
			sum = sum + temp;
			d = d / 10;
		}
		System.out.println("sum of digit is " + sum);

	}

}
