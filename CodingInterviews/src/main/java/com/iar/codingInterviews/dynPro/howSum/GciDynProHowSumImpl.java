package com.iar.codingInterviews.dynPro.howSum;

import java.util.ArrayList;
import java.util.List;

public class GciDynProHowSumImpl implements GciDynProHowSum {

	// m = targetSum
	// n = # number of numbers
	// Time: O(n^m)
	// Space: O(m)
	public List<Integer> howSum(int targetSum, List<Integer> numbers) {
		
		if(targetSum<0) {
			return null;
		}
		
		if(targetSum==0) {
			return new ArrayList<>();
		}

		for(int number : numbers) {
			int remainder = targetSum - number;
			List<Integer> remainderHowSum = howSum(remainder, numbers);
			if(remainderHowSum!=null) {
				List<Integer> result =  new ArrayList<>(remainderHowSum);
				result.add(number);
				return result;
			}
		}
		
		return null;
	}
}
