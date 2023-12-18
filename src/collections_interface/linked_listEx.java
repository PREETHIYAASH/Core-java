package collections_interface;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_listEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(56);
		ll.add(98);
		ll.add(56);
		System.out.println("My element using listiterator: ");
		Iterator<Integer> itr =ll.listIterator();
		while(itr.hasNext()) {
			int i=itr.next();
			System.out.println(i);
		}
		System.out.println("My element using descending iterator: ");
		Iterator<Integer> itr1 =ll.descendingIterator();
		while(itr1.hasNext()) {
			int i=itr1.next();
			System.out.println(i);
		}
		System.out.println("My element using iterator: ");
		Iterator<Integer> itr2 =ll.listIterator();
		while(itr2.hasNext()) {
			int i=itr2.next();
			System.out.println(i);
		}
		System.out.println("Element in linkedlist: "+ll);
		System.out.println("My Linkedlist element: "+ll.size());
	}

	
}
