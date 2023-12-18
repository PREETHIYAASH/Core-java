package assignment;

import java.util.Scanner;

class Armsterdam{
	public int preeti(String s) {
		int count=0;
		String str=s.toLowerCase();
		String a[]=str.split(" ");
		for(int i=0;i<str.length();i++) {
			if(a[i].equals("am")) {
				count=count+1;
			}
		}
		return count;
	}
}

public class Amsterdan {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Armsterdam arm=new Armsterdam ();
			String input=sc.nextLine();
			int result=arm.preeti(input);
			System.out.println(result);
		}
	}

}
