package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int i = sc.nextInt();

		System.out.println("Please enter an double: ");
		double d = sc.nextDouble();

		sc.nextLine(); // Clean the buffer
		
		System.out.println("Please enter an String: ");
		String str = sc.nextLine();

		
		System.out.println("The integer is: " + i);
		System.out.println("The double is: " + d);
		System.out.println("The string is: " + str);
		
		sc.close();
	}

}
