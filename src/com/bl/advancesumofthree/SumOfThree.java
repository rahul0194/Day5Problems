package com.bl.advancesumofthree;

import java.util.Scanner;

public class SumOfThree {
	public int findDistinctTriplets(int a[], int length)// method 1
	{
		int i, j, k, count = 0;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				for (k = j + 1; k < length; k++) {
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
			}
		}
		// return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// enter the array size
		System.out.print("Enter Size of Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];// create array & read values one by one

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Value :");
			arr[i] = sc.nextInt();
		}

		SumOfThree t1 = new SumOfThree();
		int sum = t1.findDistinctTriplets(arr, size);// pass the arguments to method 1
		System.out.println("No.of Tripltes :" + sum);
		System.out.println();
		sc.close();
	}
}
