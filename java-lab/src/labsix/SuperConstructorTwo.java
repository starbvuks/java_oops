package labsix;

class Person {
	int id;
	String name;
	
	Person() {
		System.out.println("I am in person class");
	}
	
	Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
}

class Emp extends Person {
	float salary;
	Emp() {
		super();
	}
	
	Emp(int id, String name, float salary) {
		super(id,name);
		this.salary = salary;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class SuperConstructorTwo {
	public static void main(String[] args) {
		Emp e2=new Emp();
		Emp e1=new Emp(1, "Anish", 45000f);
		e1.display();
	}
}
