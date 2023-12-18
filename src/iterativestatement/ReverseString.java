package iterativestatement;

public class ReverseString {

	public static void main(String[] args) {
		String preeti = "dsd";
		String preeti2="";
		for(int i=preeti.length()-1;i>=0;i--) {
			preeti2=preeti2+preeti.charAt(i);
		}
		System.out.println(preeti2);
		if(preeti.equals(preeti2))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
