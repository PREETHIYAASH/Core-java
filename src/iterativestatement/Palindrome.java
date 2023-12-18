package iterativestatement;

public class Palindrome {

	public static void main(String[] args) {
		int n=121;
		int temp=n;
		int rev =0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		System.out.println(temp);
		System.out.println("rev"+rev);
		if(temp==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrom");
		}
		

	}

}
