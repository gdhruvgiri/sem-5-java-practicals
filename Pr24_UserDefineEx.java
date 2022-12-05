class MyException extends Exception {
    private int cf;

    MyException(int cg) {
        cf = cg;
    }

    public String toString() {
        return "Exception :  Number cannot be divided by " + cf;
    }
}

public class Pr24_UserDefineEx {
    static void divide(int ch, int cg) throws MyException {
        if (cg <= 0) {
            throw new MyException(cg);
        } else {
            System.out.println("Division : " + ch / cg);
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (MyException ci) {
            System.out.println(ci);
        }
    }
}
