package com.epam.training.di;

//Display the correspondence between symbols and their 
//numerical designations in the computer memory.(Task_6)
public class Main {
	public static void main(String[] args) {
		short i = 1;
		while (true) {
			if (i >= 0x0020 && i <= 0x007F) {
				System.out.printf("%c  %d\n", (char) i, i);
			}
			if (i >= 0x0410 && i <= 0x044F) {
				System.out.printf("%c  %d\n", (char) i, i);
			}
			i++;
			if (i == 0)
				break;
		}

	}
}
