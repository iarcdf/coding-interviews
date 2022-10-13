package com.iar.codingInterviews.dynPro.bestSum;

import java.util.ArrayList;
import java.util.List;

public class GciDynProBestSumDepthFirstSearchTabulated implements GciDynProBestSum {

	// n = # nodes
	// Time: O(n^m)
	// Space: O(n+m)
	public List<Integer> bestSum(int targetSum, List<Integer> numbers) {

		List<Integer>[] table = new List[targetSum + 1];

		if (targetSum < 0)
			return null;

		table[0] = new ArrayList<>();

		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				for (int number : numbers) {
					if ((i + number) < table.length) {
						if (table[i + number] == null) {
							List<Integer> combination = new ArrayList<>(table[i]);
							combination.add(number);
							table[i + number] = combination;
						}
					}
				}
			}
		}

		return table[targetSum];
	}
}
