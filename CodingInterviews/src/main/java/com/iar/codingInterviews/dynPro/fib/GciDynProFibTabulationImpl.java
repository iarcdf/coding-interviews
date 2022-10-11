package com.iar.codingInterviews.dynPro.fib;

public class GciDynProFibTabulationImpl implements GciDynProFib {

	public int fib(int n) {

		Integer[] table = new Integer[n + 1];

		int result = 0;

		for (int i = 0; i < table.length; i++) {

			if (i == 0) {
				table[i] = 0;
			} else if (i == 1) {
				table[i] = 1;
			} else {
				table[i] = table[i - 1] + table[i - 2];
			}

			if (i == n) {
				return table[i];
			}
		}

		return result;
	}
}
