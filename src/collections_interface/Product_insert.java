package collections_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class Product_insert {

	public static void main(String[] args) {
		ArrayList<Product> al=new ArrayList<>();
		Product p=new Product(1,"Mobile",10000);  //1st way
		al.add(p);  //1st way
		al.add(new Product (2,"tablet",50000));//2nd way 
		al.add(new Product (3,"Oven",60000));
		al.add(new Product (4,"television",3000));
		System.out.println("Elements in arraylist: "+al);
		System.out.println("Elements in arraylist using enanced forloop: ");
		for(Product pl:al) {   //3rd way
			//System.out.println(pl);
			System.out.println("Pid: "+pl.getName());
			System.out.println("Pname: "+pl.getName());
			System.out.println("Pamount: "+pl.getAmount());
		}
		System.out.println("Element in arraylist using Iterator:");
		Iterator<Product> iter=al.iterator();  //4t iterative way
		while(iter.hasNext()) {
			Product  pl=iter.next();
			System.out.println(pl);
		}
	}

}
