package labthree;

public class Employee {
	int empId;
	String empName;
	Employee(int id, String name) {
		this.empId = id;
		this.empName = name;
	}
	void info() {
		System.out.println("Id: " + empId + "Name: " + empName);
	}
	public static void main (String args[]) {
		Employee obj1 = new Employee(10245, "Sarvag");
		Employee obj2 = new Employee(92232, "Kalari");
		
		obj1.info();
		obj2.info();
	}
}
