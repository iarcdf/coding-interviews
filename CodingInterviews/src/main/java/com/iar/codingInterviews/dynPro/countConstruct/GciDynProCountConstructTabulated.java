package com.iar.codingInterviews.dynPro.countConstruct;

import java.util.List;

public class GciDynProCountConstructTabulated implements GciDynProCountConstruct {

	public int countConstruct(String target, List<String> wordBank) {

		int[] table = new int[target.length() + 1];

		table[0] = 0;

		for (String word : wordBank) {
			if (word.length() < table.length) {
				if (target.startsWith(word)) {
					table[word.length()] = 1;
				}
			}
		}

		for (int i = 1; i < table.length; i++) {
			for (String word : wordBank) {
				if (i + word.length() < table.length) {
					String prefix = target.substring(0, i) + word;
					if (target.startsWith(prefix) && table[i + word.length()] > 1) {
						table[i + word.length()] = table[i + word.length()] + 1;
					}
				}
			}
		}

		return table[target.length()];
	}
}
