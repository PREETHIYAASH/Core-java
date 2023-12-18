package inheritance;           // sow eg
class Instagram_login{
	String name;int age;
	Instagram_login(String n,int a){   //parameterized constructor
		this.name=n;
		this.age=a;
	}
	public void show() {      //method
		System.out.println("Username:"+name);
		System.out.println("Age:"+age);
	}
}
interface Login{  
	void email();  //abs method ,no return type ,cant create obj, doesnt ave body
	void password(); //"
}
class User extends Instagram_login implements Login{
    String Account_type;
	User(String n, int a,String type) {
		super(n, a);
		this.Account_type=type;
	}
	static void after_login() {
		System.out.println("put your fav pic on your profile.");
	}
	void account() {
		System.out.println("Save your account:"+Account_type);
	}
	@Override
	public void email() {
		System.out.println("your email is required for login");
		
	}
	@Override
	public void password() {
		System.out.println("password is must required for insta login");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		User obj=new User("Preethi",21,"private");
		obj.show();
		obj.email();
		obj.password();
		obj.account();
		User.after_login();
	}

}

