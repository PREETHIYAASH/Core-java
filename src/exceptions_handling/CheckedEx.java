package exceptions_handling;

public class CheckedEx {

	public static void main(String[] args) {
		try {
			int a[]= {1,2,3};
			System.out.println("Array element:"+a[5]);
			int c=20/0;
			String s="abc";
			System.out.println("Element c:"+c);
			int ss=Integer.parseInt(s);
			System.out.println("Value ofss:"+ss);
			int er[]=null;
			System.out.println("length "+ er.length );
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		catch(Exception e1) {
			System.out.println(e1);
			
		}
		finally {
			System.out.println("finallyblock");
		}

	}

}
