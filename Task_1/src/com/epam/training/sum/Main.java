package com.epam.training.sum;

import java.util.Scanner;

//The user enters any positive integer.
//And the program adds up all numbers from one to 
//the number entered by the user
public class Main {
	public static void main(String[] args) {
		int a;
		int z = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("type value of A\n>>");
		a = TypingInt(scn);
		// -----
		for (int i = 1; i <= a; i++) {
			z += i;
		}

		System.out.println("The answer is\n>>" + z);
	}

	public static int TypingInt(Scanner sc) {
		int a;
		while (true) {
			while (!sc.hasNextInt()) {
				System.out.print(" \"" + sc.next() + "\"");
				System.out.print(" it is't type INT\n>>");
			}
			a = sc.nextInt();
			if (a <= 1) {
				System.out.print(" wrong \n>>");
			} else {
				break;
			}
		}
		return a;
	}

}
