// PR 5

import java.util.Scanner;

public class Pr5_ReverseNumber {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter The No.:- ");
        int n = ls.nextInt();
        int reverse = 0;
        while (n != 0) {
		int r = n%10;
		reverse = (reverse * 10) + r;
		n /= 10; 
        }
	System.out.println(reverse);
    }
}
