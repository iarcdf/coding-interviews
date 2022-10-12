package com.iar.codingInterviews.dynPro.howSum;

import java.util.ArrayList;
import java.util.List;

public class GciDynProHowSumTabulatedImpl implements GciDynProHowSum {

	public List<Integer> howSum(int targetSum, List<Integer> numbers) {

		List<Integer>[] table = new List[targetSum + 1];

		table[0] = new ArrayList<>();

		for (int i = 0; i < table.length; i++) {

			for (int number : numbers) {
				if ((i + number) < table.length) {
					if (table[i] != null) {
						List<Integer> combination = new ArrayList<>(table[i]);
						combination.add(number);
						table[i + number] = combination;
					}
				}
			}
		}

		return table[targetSum];
	}
}
