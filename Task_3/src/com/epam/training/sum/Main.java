package com.epam.training.sum;

//Find value sum of squares of the first anything or 100 numbers;
//Комп (Task_3)
public class Main {
	public static void main(String[] args) {
		long x, sum = 0;
		// sc inp = new sc();
		x = 100;
		// x = inp.getI();
		for (int i = 1; i <= x; i++) {
			sum += i * i;
		}
		System.out.printf("%d", sum);
	}
}
