package collections_interface;

public class Product {
	int no;
	String name;
	int amount;
	

	@Override
	public String toString() {   //generate string 
		return "Product [no=" + no + ", name=" + name + ", amount=" + amount + "]";
	}


	public int getNo() {  //getter&setters
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Product(int no, String name, int amount) {//constructor
		super();
		this.no = no;
		this.name = name;
		this.amount = amount;
	}


	public static void main(String[] args) {
		
		
		

	}

	

}
