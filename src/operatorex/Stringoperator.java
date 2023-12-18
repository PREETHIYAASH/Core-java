package operatorex;

public class Stringoperator {

	public static void main(String[] args) {
		String s = "Aello hello 123";
		String ss = "hello 123";
		String s1 = new String("everyone");
		System.out.println("Concate : " + s.concat(s1));
		System.out.println("Length : " + s1.length());
		System.out.println("Uppercase : " + s1.toUpperCase());
		System.out.println("Equal : " + s.equals(s1));
		System.out.println("EqualIgnorecase : " + s.equalsIgnoreCase(ss));
		System.out.println("Char at: " + s.charAt(2));
		System.out.println("compare : " + s.compareTo(ss));
		System.out.println("Compare ignore case :" + s.compareToIgnoreCase(ss));
		System.out.println("Index of :" + s.indexOf('l'));
		System.out.println("Last Index of :" + s.lastIndexOf('l'));
		System.out.println("Replace :" + s.replace('e', 'o'));
		System.out.println("String: " + s);
		System.out.println("Contains :" + s.contains(ss));
		System.out.println("Ends with :" + s.endsWith("123"));
		System.out.println("substring :" + s.substring(2, 5));
		String str1 = "Java123is456fun";
		String regex = "\\d+";
		System.out.println(str1.replaceAll(regex, " ** "));
		String str2 = "";
		String s3 = "  ";
		System.out.println("Is Empty: " + str2.isEmpty());
		System.out.println("Is Blank : " + s3.isBlank());
		String strr = "Java Coding";

		char[] ch;
		//convert string into charcter array
		ch = strr.toCharArray();
		System.out.println(ch);
		
	}


}


