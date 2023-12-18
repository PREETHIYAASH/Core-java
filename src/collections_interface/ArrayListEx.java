package collections_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList <Integer> a =new ArrayList<>();
		a.add(10);
		a.add(16);
		a.add(67);
		a.add(4);
		a.add(67);
		//a.add(null);
		a.add(10);
		a.remove(1);
		a.clear();
		System.out.println("My sorted element: ");
	    Collections.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
		
		System.out.println("is empty: "+a.isEmpty());
		System.out.println("is contains: "+a.contains(20));
		System.out.println("is index: "+a.indexOf(67));
		System.out.println("is size: "+a.size());
		System.out.println("is empty: "+a.hashCode());
		
		
		//string
		ArrayList<String> b=new ArrayList<>();
		b.add("preeti");
		b.add("priya");
		b.add("divya");
		System.out.println("My sorted string element: ");
		 Collections.sort(b);
			for(String j:b) {
				System.out.println(j);
			}
			System.out.println("is empty: "+b.isEmpty());
			System.out.println("is contains: "+b.contains("divya"));
			System.out.println("is index: "+b.indexOf("priya"));
			System.out.println("is size: "+b.size());
			System.out.println("is empty: "+b.hashCode());
		
		
	}

}

