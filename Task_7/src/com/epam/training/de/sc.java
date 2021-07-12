package com.epam.training.de;

import java.util.Scanner;

//Комп
public class sc {

	public sc() {
		super();
		this.sc = new Scanner(System.in);
	}

	Scanner sc;

	public double getD(String s) {
		System.out.print("Please type value " + s + "\n>>");
		while (!sc.hasNextDouble()) {
			System.out.print("\"" + sc.next() + "\" is not Double \n");
			System.out.print(">>");
		}
		return sc.nextDouble();
	}

	public int getI(String s) {
		int a;
		System.out.print("Please type value " + s + "\n>>");
		while (!sc.hasNextInt()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type int\n>>");
		}
		a = sc.nextInt();
		return a;
	}
}
