package com.iar.codingInterviews.dynPro.bestSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GciDynProBestSumDepthFirstSearch implements GciDynProBestSum {

	// n = # nodes
	// Time: O(n^m)
	// Space: O(n+m)
	public List<Integer> bestSum(int targetSum, List<Integer> numbers) {

		Map<Integer, List<Integer>> memo = new HashMap<>();

		List<Integer> targetBestSum = bestSum(targetSum, numbers, memo);

		return targetBestSum;
	}

	private List<Integer> bestSum(int targetSum, List<Integer> numbers, Map<Integer, List<Integer>> memo) {

		if (targetSum < 0)
			return null;

		if (targetSum == 0)
			return new ArrayList<>();

		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}

		List<Integer> targetBestSum = null;

		for (int number : numbers) {

			int remainder = targetSum - number;

			List<Integer> remainderBestSum = null;

			if (memo.containsKey(remainder)) {
				remainderBestSum = memo.get(remainder);
			} else if (remainder == 0) {
				targetBestSum = new ArrayList<>();
				targetBestSum.add(number);
				memo.put(targetSum, targetBestSum);
				return targetBestSum;
			} else if (remainder > 0) {
				remainderBestSum = bestSum(remainder, numbers, memo);
			}

			if (remainderBestSum != null) {
				if (targetBestSum == null || targetBestSum.size() > (remainderBestSum.size() + 1)) {
					targetBestSum = new ArrayList<>(remainderBestSum);
					targetBestSum.add(number);
				}
			}
		}

		memo.put(targetSum, targetBestSum);

		return targetBestSum;
	}
}
