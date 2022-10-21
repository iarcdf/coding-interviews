package com.iar.codingInterviews.leetcode.topKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GciLeetCodeTopKFrequentElements {

	@Test
	public void test1() {
		int[] result = topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
		assert (result[0] == 1);
		assert (result[1] == 2);
	}

	@Test
	public void test2() {
		int[] result = topKFrequent(
				new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6 }, 10);
		assert (result[0] == 1);
		assert (result[1] == 2);
	}

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> numToFreq = new HashMap<>();
		Map<Integer, List<Integer>> freqToNum = new HashMap<>();
		Integer one = 1;
		freqToNum.put(one, new ArrayList<>());
		for (int i = 0; i < nums.length; i++) {
			Integer num = nums[i];
			if (!numToFreq.containsKey(num)) {
				numToFreq.put(num, one);
				freqToNum.get(one).add(num);
			} else {
				Integer freq = numToFreq.get(num);
				freqToNum.get(freq).remove(num);
				freq++;
				numToFreq.put(num, freq);
				if (freqToNum.containsKey(freq)) {
					freqToNum.get(freq).add(num);
				} else {
					List<Integer> list = new ArrayList<>();
					list.add(num);
					freqToNum.put(freq, list);
				}
			}
		}
		int[] result = new int[k];
		Object[] sortedFreqs = numToFreq.keySet().toArray();
		Arrays.sort(sortedFreqs);
		for (int i = 0; i < sortedFreqs.length; i++) {
			System.out.println(sortedFreqs[i] + ":" + freqToNum.get(sortedFreqs[i]));
		}
		int i = sortedFreqs.length - 1;
		int j = 0;
		while (i >= 0 && j < k) {
			Integer freq = (Integer) sortedFreqs[i];
			List<Integer> list = freqToNum.get(freq);
			for (Integer num : list) {
				result[j] = num;
				j++;
			}
			i--;
		}
		return result;
	}

}
