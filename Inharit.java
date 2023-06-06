
public class Inharit {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setName("ABC");
		m1.setaddress("ABC street");
		m1.setspecilization("JAVA");
		m1.setdepartment("ICT");
		m1.setsal(20000);
		System.out.println(m1);
		System.out.println(m1.sal);
	}

}


class Member {
	String Name, Address;
	int Age,Num,sal;
	
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setaddress(String Address) {
		this.Address=Address;
	}
	public int getsal() {
		return sal;
	}
	public void setsal(int sal) {
		this.sal=sal;
	}
	
}

class Employee extends Member 
{
	String specilization;
	
	public String getspecilization() {
		return specilization;
	}
	public void setspecilization(String specilization) {
		this.specilization=specilization;
	}
	
}

class Manager extends Employee
{
	String department;
	
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	@Override
	public String toString() {
		return ("Name=" + getName() + " Address= " + getAddress() + " specilization = " + getspecilization() + "  department= " + getdepartment());
	}
}
