class Cabin {
	public int cabinNumber;

	Cabin(int number) {
		this.cabinNumber = number;
	}
}

public class Main {
	public String name;
	public Cabin cabin;

	public Main(String name, Cabin c) {
		this.name = name;
		this.cabin = c;
	}

	public void updateCabin(Cabin c) {
		this.cabin.cabinNumber = c.cabinNumber;
	}

	public static void main(String args[]) {
		Cabin c1 = new Cabin(121);
		Main p1 = new Main("Ronald", c1);
		Main p2 = new Main("Bonnie", c1);
		Cabin c2 = new Cabin(122);
		p1.updateCabin(c2);
		System.out.println(p1.cabin.cabinNumber);
		System.out.println(p2.cabin.cabinNumber);
	}

}