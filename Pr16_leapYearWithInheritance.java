// PR 16

import java.util.Scanner;

class A {
	public void leap(int year) {
		boolean leap = false;

		if(year % 4 == 0) {
			if(year % 100 == 0){
				if(year % 400 == 0){
					leap = true;
				} 
			} else {
				leap = true;
			}
		}
		if(leap) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
	}
}
class B extends A {
	public void check(int year) {
		leap(year);
	}	
}

public class Pr16_leapYearWithInheritance {
	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		B obj = new B();
		System.out.println("Enter the year: ");
		obj.check(s.nextInt());
	}
}