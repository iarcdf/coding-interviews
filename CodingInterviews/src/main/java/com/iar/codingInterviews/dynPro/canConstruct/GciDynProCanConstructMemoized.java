package com.iar.codingInterviews.dynPro.canConstruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GciDynProCanConstructMemoized implements GciDynProCanConstruct {

	// n = # nodes
	// Time: O(n^m)
	// Space: O(n+m)
	public boolean canConstruct(String target, List<String> wordBank) {
		return canConstruct(target, wordBank, new HashMap<String, Boolean>());
	}

	private boolean canConstruct(String target, List<String> wordBank, Map<String,Boolean> memo) {

		if (target == null)
			return false;

		if (target.isBlank())
			return true;
		
		if(memo.containsKey(target)) {
			return memo.get(target);
		}

		for (String word : wordBank) {

			if (target.startsWith(word)) {
				String remainder = target.substring(word.length(), target.length());
				if (canConstruct(remainder, wordBank, memo)) {
					memo.put(target, true);
					return true;
				}
			}
		}
		
		memo.put(target, false);
		return false;
	}
}
