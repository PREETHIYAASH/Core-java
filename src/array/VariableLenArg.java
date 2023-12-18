package array;

public class VariableLenArg {

	public static void main(String[] args) {
		System.out.println(sum(3,5,6,7,8));
	}
	public static int sum(int...numbers) {      //variable args
		int total=0;
		for(int x:numbers) {
			total+=x;
		}
		return total;
	}

}
