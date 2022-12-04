import java.util.Scanner;

public class Pr25_MultiTryException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int n = Integer.parseInt(s.nextLine());
            if (99 % n == 0) {
                System.out.println(n + " is a factor of 99");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception " + e.getMessage());
        }
    }
}
