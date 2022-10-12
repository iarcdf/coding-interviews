package com.iar.codingInterviews.dynPro.canSum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GciDynProCanSumMemoizedImpl implements GciDynProCanSum {

	// m = targetSum
	// n = # number of numbers
	// Time: O(m)
	// Space: O(m^2)
	public boolean canSum(int targetSum, List<Integer> numbers) {

		Map<Integer, Boolean> memo = new HashMap<>();

		return canSum(targetSum, numbers, memo);
	}

	private boolean canSum(int targetSum, List<Integer> numbers, Map<Integer, Boolean> memo) {

		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}

		if (targetSum < 0) {
			memo.put(targetSum, false);
			return false;
		}

		if (targetSum == 0) {
			memo.put(targetSum, true);
			return true;
		}

		for (int number : numbers) {
			int remainder = targetSum - number;
			if (canSum(remainder, numbers, memo)) {
				memo.put(targetSum, true);
				return true;
			}
		}

		memo.put(targetSum, false);
		return false;
	}
}
