public class Pr11_CopyConst {

	int id;
	String name;
	Pr11_CopyConst(int i, String s) {
		id = i;
		name = s;
	}

	Pr11_CopyConst(Pr11_CopyConst c) {
		id = c.id;
		name = c.name;
	}

	void dis() {
		System.out.println(id + " " + name);
	}

	public static void main(String s[]) {
		Pr11_CopyConst obj = new Pr11_CopyConst(25,"Dhruvgiri");
		Pr11_CopyConst obj2 = new Pr11_CopyConst(obj);

		obj.dis();
		obj2.dis();
	}

}