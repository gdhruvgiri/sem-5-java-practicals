import java.util.*;

class Pr26 {
    double cf;

    void deposit(double cg) {
        cf = cg;
    }

    void withdraw(double cg) throws Exception {
        double ch = cf - cg;
        if (ch < 500) {
            throw new Exception("Not Sufficient amount");
        } else {
            cf = ch;
            System.out.println("Balance After Withdraw : " + cf);
        }
    }

    public static void main(String arg[]) {
        Pr26 ci = new Pr26();
        // double dt = 1000;
        ci.deposit(1000.00);
        while (true) {
            try {
                double cg;
                Scanner cj = new Scanner(System.in);
                System.out.println("Enter Amount for withdraw : ");
                cg = cj.nextInt();
                System.out.println("Withdrawing Amount : " + cg);
                ci.withdraw(cg);
                System.out.println();
            } catch (Exception ck) {
                System.out.println(ck.getMessage());
                break;
            }
        }
    }
}