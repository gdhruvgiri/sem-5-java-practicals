import java.util.Scanner;

public class Pr3_MaxThreeNumber {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter 1st No.:- ");
        int n1 = ls.nextInt();
        System.out.println("Enter 2nd No.:- ");
        int n2 = ls.nextInt();
        System.out.println("Enter 3rd No.:- ");
        int n3 = ls.nextInt();

        String maxOut = (n1 > n2 && n1 > n3) ? "Max No. is " + n1 + " (1st No.)"
                : (n2 > n1 && n2 > n3) ? "Max No. is " + n2 + " (2nd No.)"
                        : (n3 > n1 && n3 > n2) ? "Max No. is " + n3 + " (3rd No.)"
                                : "";

        System.out.println(maxOut);
    }
}
