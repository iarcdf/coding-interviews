package com.iar.codingInterviews.dynPro.canSum;

import java.util.List;

public class GciDynProCanSumTabulatedImpl implements GciDynProCanSum {

	public boolean canSum(int targetSum, List<Integer> numbers) {

		boolean[] table = new boolean[targetSum + 1];

		table[0] = true;

		for (int i = 0; i < table.length; i++) {
			if (table[i]) {
				for (Integer number : numbers) {
					if ((i + number) < table.length) {
						table[i + number] = true;
					}
				}
			}
		}

		return table[targetSum];
	}
}
