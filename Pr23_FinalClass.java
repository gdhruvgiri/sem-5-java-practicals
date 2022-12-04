final class myFinalClass {
    void Method() {
        System.out.println("Final class");
    }
}

class Pr23_FinalClass {
    public static void main(String arg[]) {
        myFinalClass fc = new myFinalClass();
        fc.Method();
    }
}
