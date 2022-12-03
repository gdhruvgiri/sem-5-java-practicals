public class Pr12_CountConst {
	static int count = 0;
	
	private CountConst() {
System.out.println("default Constuctor Called !");
		count++;
	}

	CountConst(int value) {
System.out.println("not default Constuctor ! Value is " + value);
	}

	void allInst() {
		System.out.println();
		System.out.println(count + " Instances created using default Constuctor !");
	}

	public static void main(String s[]) {
		CountConst obj = new CountConst();
		CountConst obj2 = new CountConst(2);
		CountConst obj3 = new CountConst();
		CountConst obj4 = new CountConst();
		CountConst obj5 = new CountConst(12);

		obj.allInst();
	}
}