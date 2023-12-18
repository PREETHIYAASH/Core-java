package array;

public class ArrayClone {

	public static void main(String[] args) {
//		int[] intArray= {1,2,3,4};
//		int[] cloneArray=intArray.clone();
//		//shallow copy applied for one dimensional->store in different memory location
//		System.out.println(intArray==cloneArray);
//		for(int i=0;i<cloneArray.length;i++) {
//			System.out.print(cloneArray[i]+" ");
//		}
		int intArray[][]= {{1,2},{3,4}};
		int cloneArray[][]=intArray.clone();
		//deep copy applied for one dimensional->store in same memory location
		System.out.println(intArray[1][0]==cloneArray[1][0]);
		for(int i=0;i<cloneArray.length;i++)
		{
			for(int j=0;j<cloneArray.length;j++) {
				System.out.print(cloneArray[i][j]+" ");
			}
			System.out.println();
		}
		}

}
