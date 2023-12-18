package collections_interface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		Employee employee1=new Employee("Raja",111);
		Employee employee2=new Employee("Raja",111);
		Set employees=new HashSet();  //set declare1
		employees.add(employee1);
		employees.add(employee2);
		System.out.println((employees));
	
//		Set s=new HashSet();  another declaration of set
//		s.add(100);
//		s.add(100);
//		System.out.println(s);
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
