package classcomposition;

public class Person {
	String name;
	
	public  Person(String name) { //constructor
		this.name=name;
	}
	public class Birthday{  //another class
		int day,month,year;
		public Birthday(int day,int month,int year) {  //constructor
			this.day=day;
			this.month=month;
			this.year=year;
		}
		public void printBirthday() { //function 
			System.out.println("Birthday "+day + " "+month+ " "+ year);
			
		}
	}
	public void printData() { //function 
		System.out.println("name: "+name);
		
	}

}
