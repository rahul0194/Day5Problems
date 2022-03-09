package com.bridgelabz.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) {

		int a = 50;
		int b = 4;

		
		System.out.println("Quoitent : "+ a/b);
		System.out.println("remainder : "+ a%b);
		
		try {
			PrintWriter write = new PrintWriter("abc.txt");
			write.write("Hello World....");
			write.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}