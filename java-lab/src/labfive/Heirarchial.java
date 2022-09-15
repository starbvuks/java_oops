package labfive;

class Employee {
	double salary =  50000;
	Employee()
	{
		
	}
	void displaySalary() {
		System.out.println("Employee Salary: Rs." + salary);
	}
}

class FullTimeEmployee extends Employee {
	double hike = 0.50;
	FullTimeEmployee(){
		super();
	}
	
	 void incrementSalary() {
		 salary = salary + (salary + hike);
	 }
}

class InternEmployee extends Employee {
	double hike = 0.25;
	
	
	void incrementSalary() {
		salary = salary + (salary + hike);
	}
}

public class Heirarchial {
	public static void main(String args[]) {
		FullTimeEmployee emp1 = new FullTimeEmployee();
		InternEmployee emp2 = new InternEmployee();
		
		System.out.println("Salary of full time employee after increment: ");
		emp1.incrementSalary();
		emp1.displaySalary();
		
		System.out.println("Salary of intern time employee after increment: ");
		emp2.incrementSalary();
		emp2.displaySalary();
		
	}
}
