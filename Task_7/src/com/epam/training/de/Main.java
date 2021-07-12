package com.epam.training.de;

//For each natural number in the range from m to n,
//output all divisors except one(Task_7) 
//and the number itself. m and n are entered from the keyboard.
public class Main {
	public static void main(String[] args) {
		sc S = new sc();
		int n1, m1;

		m1 = S.getI("m");
		while (true) {
			n1 = S.getI("n");
			if (n1 > m1)
				break;
			else
				System.out.println("n > m");
		}
		for (int n = m1; n <= n1; n++) {
			int us = 2;
			System.out.print(n);
			do {
				if ((n % us) == 0) {
					System.out.print("->");
					System.out.print(us);

				}
				us++;
			} while (us < n);
			System.out.print("\n");
		}
	}
}
