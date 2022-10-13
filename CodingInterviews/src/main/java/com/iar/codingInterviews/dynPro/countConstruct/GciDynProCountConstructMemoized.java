package com.iar.codingInterviews.dynPro.countConstruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GciDynProCountConstructMemoized implements GciDynProCountConstruct {

	public int countConstruct(String target, List<String> wordBank) {
		Map<String, Integer> memo = new HashMap<>();
		return countConstruct(target, wordBank, memo);
	}

	private int countConstruct(String target, List<String> wordBank, Map<String, Integer> memo) {
		
		if (memo.containsKey(target)) {
			return memo.get(target);
		}

		if (target == null)
			return 0;

		if (target.isBlank()) {
			memo.put(target, 1);
			return 1;
		}

		int count = 0;

		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String suffix = target.substring(word.length());
				count += countConstruct(suffix, wordBank, memo);
			}
		}

		memo.put(target, count);
		return count;
	}
}
