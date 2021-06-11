package com;

import java.util.Random;

public class OopsUtility {
	
	/**
	 * Purpose: shuffles the card of deck
	 * assigning f1 and f2 has random
	 * @param arr array of cards
	 * @return returns shuffle array
	 */
	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}
}

