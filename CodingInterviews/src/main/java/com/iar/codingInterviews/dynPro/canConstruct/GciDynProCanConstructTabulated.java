package com.iar.codingInterviews.dynPro.canConstruct;

import java.util.List;

public class GciDynProCanConstructTabulated implements GciDynProCanConstruct {

	// n = # nodes
	// Time: O(n^m)
	// Space: O(n+m)
	public boolean canConstruct(String target, List<String> wordBank) {

		boolean[] table = new boolean[target.length() + 1];

		table[0] = true;

		for (int i = 0; i < table.length; i++) {
			if (table[i]) {
				for (String word : wordBank) {
					if (i + word.length() < table.length) {
						String prefix = target.substring(0, i) + word;
						if (target.startsWith(prefix)) {
							table[i + word.length()] = true;
						}
					}
				}
			}
		}

		return table[target.length()];
	}
}
