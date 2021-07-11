package com.epam.training.fun;

import java.util.Scanner;

//Loop calculate value of function for length [a,b] step h; (task2) 
//y = x, x >2; y = - x, <= 2; 
public class Main {

	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		double a, b, h, y;
		System.out.println("type value of A\n>>");
		a = Typing(sk);
		System.out.println("type value of B\n>>");
		b = Typing(sk);
		System.out.println("type value of h\n>>");
		while (true) {
			h = Typing(sk);
			if (h <= 0) {
				System.out.print(" wrong \n>>");
			} else {
				break;
			}
		}
		while (a <= b) {
			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}
			System.out.println("<<<< if \"x\" = " + a + " then \"y\" = " + y);
			a += h;
		}

	}

	public static double Typing(Scanner sc) {
		double a;

		while (!sc.hasNextDouble()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type Double\n>>");
		}
		a = sc.nextDouble();
		return a;
	}
}
