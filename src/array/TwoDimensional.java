package array;

public class TwoDimensional {

	public static void main(String[] args) {
		int ar[]=new int [3]; //one dim array
		ar[0]=3;
		ar[1]=3;
		ar[2]=3;
		System.out.println(ar[1]);
		//2dim Array
		int a[][]= {{1,2,3},{5,6,7}};
		System.out.println(a[0][1]);
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
		
		//another way of declare
		int ar1[]= {3,3,6};
		System.out.println(ar1[2]);
		

	}

}
