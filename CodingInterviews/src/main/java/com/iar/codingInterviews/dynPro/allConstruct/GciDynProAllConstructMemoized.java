package com.iar.codingInterviews.dynPro.allConstruct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GciDynProAllConstructMemoized implements GciDynProAllConstruct {

	public List<List<String>> allConstruct(String target, List<String> wordBank) {

		Map<String, List<List<String>>> memo = new HashMap<>();

		List<List<String>> result = allConstruct(target, wordBank, memo);

		return result;
	}

	private List<List<String>> allConstruct(String target, List<String> wordBank,
			Map<String, List<List<String>>> memo) {

		if (memo.containsKey(target)) {
			return memo.get(target);
		}

		List<List<String>> result = new ArrayList<>();

		if (target == null) {
			memo.put(target, result);
			return result;
		}

		if (target.isBlank()) {
			result.add(new ArrayList<>());
			memo.put(target, result);
			return result;
		}

		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String remainder = target.substring(word.length(), target.length());
				List<List<String>> reaminderResult = allConstruct(remainder, wordBank, memo);
				for (List<String> remaindderResultElement : reaminderResult) {
					List<String> remaindderResultElementCopy = new ArrayList<>(remaindderResultElement);
					remaindderResultElementCopy.add(0, word);
					result.add(remaindderResultElementCopy);
				}
			}
		}

		memo.put(target, result);
		return result;
	}
}
