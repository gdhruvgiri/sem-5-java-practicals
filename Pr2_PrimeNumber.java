import java.util.Scanner;

public class Pr2_PrimeNumber {
    public static void main(String args[]) {
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter N:- ");
        int n = ls.nextInt();
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            flag = true;
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && j != i) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i + " Is Prime Number!");
            }
        }

    }
}
