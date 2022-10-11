package com.iar.codingInterviews.dynPro.bestSum;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class GciDynProBestSumBreadthFirstSearch implements GciDynProBestSum {

	// n = # nodes
	// Time: O(n^m)
	// Space: O(n+m)
	public List<Integer> bestSum(int targetSum, List<Integer> numbers) {

		Deque<Integer> remainderQueue = new ArrayDeque<>();
		Deque<List<Integer>> resultsQueue = new ArrayDeque<>();

		remainderQueue.add(targetSum);
		resultsQueue.add(new ArrayList<>());

		while (!remainderQueue.isEmpty()) {
			int currentRemainder = remainderQueue.pop();
			List<Integer> currentResult = resultsQueue.pop();
			for (int number : numbers) {
				int remainder = currentRemainder - number;
				if (remainder == 0) {
					currentResult.add(number);
					return currentResult;
				} else if (remainder > 0) {
					remainderQueue.add(remainder);
					List<Integer> result = new ArrayList<>();
					for (int currentResultNumber : currentResult) {
						result.add(currentResultNumber);
					}
					result.add(number);
					resultsQueue.add(result);
				}
			}
		}

		return null;
	}
}
