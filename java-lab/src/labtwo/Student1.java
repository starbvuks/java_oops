package labtwo;

class Student1 {
	String name, city;
	int age;
	static int m;

	void printData() {
		System.out.println("Student name = " + name);
		System.out.println("Student city = " + city);
		System.out.println("Student age = " + age);
	}
}

class Stest {
	public static void main(String args[]) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();

		s1.name = "Amit";
		s1.city = "Dehradun";
		s1.age = 22;

		s2.name = "Kapil";
		s2.city = "Dehli";
		s2.age = 23;

		s2.printData();
		s1.printData();

		s1.m = 20;
		s2.m = 22;
		Student1.m = 27;

		System.out.println("s1.m = " + s1.m);
		System.out.println("s2.m = " + s2.m);
		System.out.println("Studentm = " + Student1.m);
	}
}
