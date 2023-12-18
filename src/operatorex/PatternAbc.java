package operatorex;

public class PatternAbc {

	public static void main(String[] args) {
		char preeti='A';
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(preeti+" ");
				preeti++;
			}
			System.out.println();
		}

	}

}
