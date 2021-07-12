
package com.epam.training.sum.bin.com.epam.training.sum;

import java.math.BigInteger;

//Multiplications of square first 200 numbers(Task_4)
public class Main {
	public static void main(String[] args) {
		String be = "1";
		int x;
		long b = 1L;
		// ------
		x = 200;
		// ------
		System.out.println("Multiplications of square first " + x + " numbers(without zero)");

		while (b <= x) {
			long s;
			s = b * b;
			BigInteger sq = new BigInteger(String.valueOf(s));
			BigInteger mul = sq.multiply(new BigInteger(be));
			be = mul.toString();
			b++;
		}
		System.out.println(be);
	}

}
