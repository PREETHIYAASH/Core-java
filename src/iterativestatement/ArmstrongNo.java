package iterativestatement;

public class ArmstrongNo {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int rim;
		int arm=0;
		while (n!=0) {
			rim=n%10;
			arm+=Math.pow(rim,3);//arm+=rim*rim*rim; 
			n=n/10;
			
			
		}
			
		System.out.println(arm);
		if(temp==arm) {
			System.out.println("armstrong no");
		}
		else {
			System.out.println("not armstrong no");
		}
	}

}
