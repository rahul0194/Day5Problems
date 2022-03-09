package com.bl.largestnumber;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:-");
		a = sc.nextInt();
		System.out.println("Enter Second number:-");
		b = sc.nextInt();
		System.out.println("Enter Third number:-");
		c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + "is Largest number");
		} else if (b >= a && b >= c) {
			System.out.println(b + "is Largest number");
		} else {
			System.out.println(c + "is Largest number");
		}
		sc.close();
	}
}
