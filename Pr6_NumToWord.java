import java.util.Scanner;

public class Pr6_NumToWord {
    public static void main(String[] args) {
        String[] ZeroArr = new String[] { "one", "Ten", "hundred", "thousand", "Lakh", "Million", "Crore" };
        String[] NumArr = new String[] { "zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten" };
        Scanner ls = new Scanner(System.in);

        System.out.println("Enter No.:- ");
        String n = ls.nextLine();

        for (int i = 0; i < n.length(); i++) {
            System.out.print(NumArr[Integer.parseInt("" + n.charAt(i))] + " ");

            if (n.length() - 1 - i >= 2) {
                System.out.print(ZeroArr[n.length() - 1 - i] + " ");
            }
        }

    }
}