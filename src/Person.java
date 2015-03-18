
public class Person {
	public String name;
	public String address;
	public String phonenumber;
	public String emailaddress;
	
	public Person(String name, String address, String phonenumber, String emailaddress){
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
	}
	@Override
	public String toString(){
		return this.getClass.getName() + "/n" + name;
	}

}

class student extends Person{
	public final String CLASS;
	
	public student(String name, String address, String phonenumber,
			String emailaddress, String classyear) {
		super(name, address, phonenumber, emailaddress);
		CLASS = classyear;
	}
}
class student1 extends Person{
	public final String CLASS;
	
	public student1(String name, String address, String phonenumber,
			String emailaddress, String classyear) {
		super(name, address, phonenumber, emailaddress);
		CLASS = classyear;
	}
}
class Employee extends Person{		
	int office;
	int salary;
	int datehired;
	public Employee(String name, String address, String phonenumber,
			String emailaddress) {
		super(name, address, phonenumber, emailaddress);

	}
}

class Staff extends Employee{
	 int title;
	public Staff(String name, String address, String phonenumber,
			String emailaddress) {
		super(name, address, phonenumber, emailaddress);
			
		}
	}




class Faculty extends Employee{
	 int officehours;
	 int rank;
	public Faculty(String name, String address, String phonenumber,
			String emailaddress) {
		super(name, address, phonenumber, emailaddress);
	}
	
}