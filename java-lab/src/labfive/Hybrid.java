package labfive;

class Grandfather {
	public void printGrandFather() {
		System.out.println("Grandfather's class");
	}
}

class Father extends Grandfather {
	public void printFather() {
		System.out.println("Father class has inhertied Grandfather");
	}
}

class Son extends Father {
	public Son() {
		System.out.println("Inside the Son Class");
	}
	public void printSon() {
		System.out.println("Son class has inherited Father Class");
	}
}

class Daughter extends Father {
	public Daughter() {
		System.out.println("inside the class Daughter");
	}
	public void printDaughter() {
		System.out.println("Daughter class has inherited Father Class");
	}
}

public class Hybrid {
	public static void main(String[] arg) {
		Son obj = new Son();
		obj.printSon();
		obj.printFather();
		obj.printGrandFather();
		
		Daughter obj2 = new Daughter();
		obj2.printDaughter();
		obj2.printFather();
		obj2.printGrandFather();
	}
}
