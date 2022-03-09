package com.bl.vowelconsonant;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter Character:-");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Character is vowel");
		} else {
			System.out.println("Character is Consonant");
		}
		sc.close();
	}

}
