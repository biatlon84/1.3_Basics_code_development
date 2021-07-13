package com.epam.training.na;

//Two numbers are given. Determine the numbers (Task_8)
//included in the recording of both the first and second numbers
public class Main {
	public static void main(String[] args) {
		long x = 1237881718932175809l;
		long y = 7620002716114102117l;

		String xx = new String();
		String yy = new String();
		xx = Long.toString(x);
		yy = Long.toString(y);

		for (int i = 0; xx.length() > i; i++)
			if (yy.indexOf(xx.charAt(i)) >= 0) {
				System.out.print(xx.charAt(i));
			}

		// ------------- another way

		System.out.print(" \n");
		boolean nAr[] = new boolean[10];
		boolean mAr[] = new boolean[10];

		while (true) {
			nAr[(int) (x % 10)] = true;
			x = (x / 10);
			if (x == 0)
				break;
		}

		while (true) {
			mAr[(int) (y % 10)] = nAr[(int) (y % 10)] == true ? true : false;
			y = (y / 10);
			if (y == 0)
				break;
		}

		for (int i = 0; nAr.length > i; i++) {
			if (mAr[i] == true)
				System.out.print(i);
		}

	}
}
