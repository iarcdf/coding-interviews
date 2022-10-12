package com.iar.codingInterviews.dynPro.howSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GciDynProHowSumMemoizedImpl implements GciDynProHowSum {

	// m = targetSum
	// n = # number of numbers
	// Time: O(m)
	// Space: O(m^2)
	public List<Integer> howSum(int targetSum, List<Integer> numbers) {

		Map<Integer, List<Integer>> memo = new HashMap<>();

		return howSum(targetSum, numbers, memo);
	}

	public List<Integer> howSum(int targetSum, List<Integer> numbers, Map<Integer, List<Integer>> memo) {

		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}

		if (targetSum < 0) {
			return null;
		}

		if (targetSum == 0) {
			List<Integer> result = new ArrayList<>();
			memo.put(targetSum, result);
			return result;
		}

		for (int number : numbers) {
			int remainder = targetSum - number;
			List<Integer> remainderHowSum = howSum(remainder, numbers, memo);
			if (remainderHowSum != null) {
				List<Integer> result = new ArrayList<>(remainderHowSum);
				result.add(number);
				memo.put(targetSum, result);
				return result;
			}
		}

		return null;
	}

}
