public class Pr11_CopyConst {

	int id;
	String name;
	CopyConst(int i, String s) {
		id = i;
		name = s;
	}

	CopyConst(CopyConst c) {
		id = c.id;
		name = c.name;
	}

	void dis() {
		System.out.println(id + " " + name);
	}

	public static void main(String s[]) {
		CopyConst obj = new CopyConst(25,"Dhruvgiri");
		CopyConst obj2 = new CopyConst(obj);

		obj.dis();
		obj2.dis();
	}

}