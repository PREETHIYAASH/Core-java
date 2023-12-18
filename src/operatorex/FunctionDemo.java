package operatorex;

public class FunctionDemo {
	int a=10,b=20;//function without return type/parameter
	void add() {
	System.out.println("Addition "+(a+b));	
	}
	//function without return type/but with parameter
	void addition(int n1,int n2) {
		System.out.println("Addition "+(n1+n2));
	}
	public static void main(String[] args) {
		FunctionDemo preeti =new FunctionDemo();  
		preeti.add();
		preeti.addition(1, 5);

	}

}
