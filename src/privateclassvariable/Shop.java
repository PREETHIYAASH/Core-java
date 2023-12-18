package privateclassvariable;

public class Shop {
    private int money;//cash starts wit 0  //this.money
    //creating constructor
    public Shop(int initialMoney) {
    	money = initialMoney; //actual money (already have in locker)
    }
	public void addMoney(int money) {
		this.money+=money;

	}
	public int getMoney() {
		return money;
	}

}
