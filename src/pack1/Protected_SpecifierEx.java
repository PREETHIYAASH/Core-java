package pack1;
class Bank{
	protected double balance;
	protected Bank(double initialbalance) {  //constructor
		this.balance=initialbalance;
	}
	protected double getbalance() {   //function
		return balance;
	}
}
class Deposit extends Bank{

	protected Deposit(double initialbalance) {
		super(initialbalance);
		// TODO Auto-generated constructor stub
	}
	
}

public class Protected_SpecifierEx {

	public static void main(String[] args) {
		

	}

}
