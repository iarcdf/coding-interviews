package com.iar.codingInterviews.leetcode.uniqueEmailAddresses;

import org.junit.jupiter.api.Test;

public class GciLeetCodeUniqueEmailAddresses {

	@Test
	public void test1() {
		int[] arr = replaceElements(new int[] { 17, 18, 5, 4, 6, 1 });
		assert (arr[0] == 18);
		assert (arr[1] == 6);
		assert (arr[2] == 6);
		assert (arr[3] == 6);
		assert (arr[4] == 1);
		assert (arr[5] == -1);
	}

	private int[] replaceElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			arr[i] = max;
		}
		return arr;
	}

}
