package array;

public class ArrayWithLoop {

	public static void main(String[] args) {
		int a[]= {1,3,6,7,9,7};
		
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+ a[i]);
		} //enhanced for loop
		for(int x:a) {
			System.out.println(x);
		}
		
			
		}
	}


// do for string and char