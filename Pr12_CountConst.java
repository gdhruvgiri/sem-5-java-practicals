public class Pr12_CountConst {
	static int count = 0;

	private Pr12_CountConst() {
		System.out.println("default Constuctor Called !");
		count++;
	}

	Pr12_CountConst(int value) {
		System.out.println("not default Constuctor ! Value is " + value);
	}

	void allInst() {
		System.out.println();
		System.out.println(count + " Instances created using default Constuctor !");
	}

	public static void main(String s[]) {
		Pr12_CountConst obj = new Pr12_CountConst();
		new Pr12_CountConst(2);
		new Pr12_CountConst();
		new Pr12_CountConst();
		new Pr12_CountConst(12);

		obj.allInst();
	}
}