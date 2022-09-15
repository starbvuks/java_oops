package labseven;

interface sum {
	int sm=90;
	void suma();
}

interface add {
	int ad=89;
	void adda();
}

class InterfaceOne implements add, sum {
	public void suma() {
		System.out.println(sm);
	}
	public void adda() {
		System.out.println(ad);
	}
	public static void main(String arr[]) {
		InterfaceOne n=new InterfaceOne();
		n.adda();
		n.suma();
	}
}
