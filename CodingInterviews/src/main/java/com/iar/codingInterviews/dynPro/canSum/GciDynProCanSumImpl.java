package com.iar.codingInterviews.dynPro.canSum;

import java.util.List;

public class GciDynProCanSumImpl implements GciDynProCanSum {

	// m = targetSum
	// n = # number of numbers
	// Time: O(n^m)
	// Space: O(m)
	public boolean canSum(int targetSum, List<Integer> numbers) {

		if (targetSum < 0)
			return false;

		if (targetSum == 0)
			return true;

		for (int number : numbers) {
			int remainder = targetSum - number;
			if (canSum(remainder, numbers)) {
				return true;
			}
		}

		return false;
	}
}
