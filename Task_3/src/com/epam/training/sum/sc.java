package com.epam.training.sum;

import java.util.Scanner;

//Комп
public class sc {

	public sc() {
		super();
		this.sc = new Scanner(System.in);
	}

	Scanner sc;

	public double getD() {
		System.out.print("Please type value like 54.6\n>>");
		while (!sc.hasNextDouble()) {
			System.out.print("\"" + sc.next() + "\" is not Double \n");
			System.out.print(">>");
		}
		return sc.nextDouble();
	}

	public int getI() {
		int a;
		System.out.print("Please type value like 73 or 100\n>>");
		while (!sc.hasNextInt()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type int\n>>");
		}
		a = sc.nextInt();
		return a;
	}
}
