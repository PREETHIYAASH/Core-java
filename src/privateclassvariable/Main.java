package privateclassvariable;

public class Main {

	public static void main(String[] args) {
		Shop shop = new Shop(100);//creating object
		shop.addMoney(10);//class calling
		shop.addMoney(14);
		shop.addMoney(17);
		System.out.println(shop.getMoney());
	}

}
