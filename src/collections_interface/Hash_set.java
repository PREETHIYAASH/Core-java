package collections_interface;
import java.util.HashSet;
public class Hash_set {
	public static void main(String[] args) {
		HashSet<Integer> pt=new HashSet<>();  //descending order
		pt.add(28);
		pt.add(34);
		pt.add(null);
		System.out.println(pt);
		HashSet<Integer> pt1=new HashSet<>();
		pt1.add(28);
		pt1.add(67);
		pt1.add(null);
		System.out.println(pt1);
		//union of two set
		pt1.addAll(pt);
		System.out.println("union of two set: "+pt1);
		pt1.retainAll(pt);
		System.out.println("intersection: "+pt1);//common in bot set
		pt1.removeAll(pt1);
		System.out.println("difference: "+pt1);
	}	
}