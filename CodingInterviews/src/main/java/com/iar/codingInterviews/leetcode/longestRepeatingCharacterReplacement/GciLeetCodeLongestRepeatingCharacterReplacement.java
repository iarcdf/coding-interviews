package com.iar.codingInterviews.leetcode.longestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GciLeetCodeLongestRepeatingCharacterReplacement {

	@Test
	public void test1() {
		assert (characterReplacement("QPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF", 4) == 7);
	}

	public int characterReplacement(String s, int k) {
		int longest = 0;
		int i = 0;
		int j = i + 1;
		Map<Character, Integer> freq = new HashMap<>();
		freq.put(s.charAt(0), 1);
		if(j < s.length()) {
			freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
		}
		while (j < s.length()) {
			int d = countCharsDifferentToChar(freq, mostFrequentChar(freq));
			if (d <= k) {
				longest = Math.max(longest, j - i + 1);
				j++;
				if(j < s.length()) {
					freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
				}
			} else {
				freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
				i++;
				if (i == j) {
					j++;
					if(j < s.length()) {
						freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
					}
				}
			}
		}
		return longest;
	}

	public int characterReplacement_bruteForce(String s, int k) {
		int longest = 0;
		for (int i = 0; i < s.length(); i++) {
			int j = i + k + 1;
			while (j <= s.length()) {
				String ss = s.substring(i, j);
				char c = mostFrequentChar(ss);
				int d = countCharsDifferentToChar(ss, c);
				if (d <= k) {
					longest = Math.max(longest, ss.length());
				}
				j++;

			}
		}
		return longest;
	}

	private char mostFrequentChar(String s) {
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
		}
		return mostFrequentChar(freq);
	}

	private char mostFrequentChar(Map<Character, Integer> freq) {
		char maxFreqChr = 0;
		int maxFreq = 0;
		for (Character chr : freq.keySet()) {
			int chrFreq = freq.get(chr);
			if (maxFreq < chrFreq) {
				maxFreq = chrFreq;
				maxFreqChr = chr;
			}
		}
		return maxFreqChr;
	}

	private int countCharsDifferentToChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				count++;
			}
		}
		return count;
	}

	private int countCharsDifferentToChar(Map<Character, Integer> freq, char c) {
		int count = 0;
		for (Character chr : freq.keySet()) {
			if (chr != c)
				count += freq.get(chr);
		}
		return count;
	}

}
