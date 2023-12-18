package iterativestatement;

public class ReverseNum {

	public static void main(String[] args) {
		int no = 123456789;
		int rev = 0;
		while (no != 0) {
			int n = no % 10;
			rev = (rev * 10) + n;
			no = no / 10;
		}
		System.out.println("Reverse : " + rev);

	}

}
//no=12
//step1: n=12%10=2
//rev=(0*10)+2;
//rev=2
//no=12/10=1

//step2
//n=1%10=1
//rev=(2*10)+1=21
//no=1/10=0s