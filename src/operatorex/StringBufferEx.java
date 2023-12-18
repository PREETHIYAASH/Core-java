package operatorex;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb=new StringBuffer("preeti");
		System.out.println(sb.append(" is a good girl"));
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("t"));
		System.out.println(sb.substring(2,4));
		System.out.println(sb.substring(2));
		
		StringBuilder sb1=new StringBuilder();
		sb1=new StringBuilder(" priya");
		System.out.println(sb1.append(" is a good girl"));
		System.out.println(sb1.charAt(2));
		System.out.println(sb1.indexOf("r"));
		System.out.println(sb1.substring(2,4));
		System.out.println(sb1.substring(2));
	}

}
