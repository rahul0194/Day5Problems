package com.bl.advancewindchill;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		//double t;
		//double v;
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:" + t + "F");
		t = sc.nextDouble();
		System.out.println("Enter the Wind Speed in Miles:" + t + "mph");
		v = sc.nextDouble();
		double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
		System.out.println("The windchill is" + windChill);
		sc.close();
	}

}
