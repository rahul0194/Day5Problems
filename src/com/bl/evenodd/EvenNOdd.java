package com.bl.evenodd;

import java.util.Scanner;

public class EvenNOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:-");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(" number is even");
		} else {
			System.out.println(" number is odd");
		}
		sc.close();
	}
}
