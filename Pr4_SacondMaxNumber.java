import java.util.Scanner;

public class Pr4_SacondMaxNumber {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter No. of Elements:- ");
        int n = ls.nextInt();
        int max = 0;
        int SecMax = 0;
        int userInt;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The " + (i + 1) + " Element:- ");
            userInt = ls.nextInt();
            if (userInt > max) {
                SecMax = max;
                max = userInt;
            }
            if (userInt >= SecMax && userInt < max) {
                SecMax = userInt;
            }
        }
        System.out.println("The Max No. is :- " + max);
        System.out.println("The SecMax No. is :- " + SecMax);
    }
}
