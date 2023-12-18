package collections_interface;

import java.util.Hashtable;

public class Hash_table {

	public static void main(String[] args) {
		Hashtable<Integer,String> t=new Hashtable<>();
		t.put(1,"java");
		t.put(2,"java");
		t.put(3,"java");
		t.put(4,"java");
		t.put(4,"pyton");
		System.out.println(t);
	}

}
