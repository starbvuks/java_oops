package labfour;

public class Bird {
	int age;
	String name;
	Bird() {
		System.out.println("this is the Parrot");
	}
	void Bird() {
		System.out.println("this is the Method Bird");
	}
	Bird (String x) {
		name = x;
		System.out.println("this is the "+name);
	}
	Bird (int y, String z) {
		age = y;
		name = z;
		System.out.println("this is the "+ age + " year old "+name);
	}
	public static void main(String arr[]) {
		Bird a = new Bird();
		a.Bird();
		Bird b = new Bird("Parakeet");
		Bird c = new Bird(20, "Woodpecker");
	}
}
