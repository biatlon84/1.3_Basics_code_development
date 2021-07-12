package com.epam.training.row;

//(Task_5)
//There is a line of numbers 
//Find sum of elements numbers line
public class Main {

	public static void main(String[] args) {
		double sum = 0;
		double a = 0;
		double e = 0.0000001;
		// -------
		int i = 1;
		while (true) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(a) < e) { // if equals - continue
				break;
			}
			sum += a;
			i++;
		}
		System.out.println("The sum of numbers which more " + e + " equals \n" + sum);
		System.out.println("Conclusion - The sum strives for 1.5 on infinity n");
		System.out.println("n =" + i);
	}
}
