// PR 15

class A {
	public void dsplA() {
		System.out.println("This is From Class A");
	}
}

class B extends A {
	public void dsplB() {
		System.out.println("This is From Class B");
	}
}

class C extends B {
	public void dsplC() {
		System.out.println("This is From Class C");
	}
}

class D extends A {
	public void dsplD() {
		System.out.println("This is From Class D");
	}
}

public class Pr15_Inheritance {
	public static void main(String s[]) {
		B obj = new B();
		obj.dsplA();
		obj.dsplB();

		System.out.println();

		C objC = new C();
		objC.dsplA();
		objC.dsplB();
		objC.dsplC();

		System.out.println();

		D objD = new D();
		objD.dsplA();
		objD.dsplD();

	}
}