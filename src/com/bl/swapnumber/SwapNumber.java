package com.bl.swapnumber;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		int x, y, t;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y:");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Before Swapping: " + x + " " + y);

		/* Swapping */

		t = x;
		x = y;
		y = t;

		System.out.println("After Swapping: " + x + " " + y);
		sc.close();
	}
}