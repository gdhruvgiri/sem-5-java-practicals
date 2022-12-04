interface a {
    void methodA();
}

interface b {
    void methodB();
}

public class Pr22_MultipleInhe implements a, b {
    public void methodB() {
        System.out.println("Method B");
    }

    public void methodA() {
        System.out.println("Method A");
    }

    public static void main(String[] args) {
        Pr22_MultipleInhe obj = new Pr22_MultipleInhe();
        obj.methodA();
        obj.methodB();
    }
}
