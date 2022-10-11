package com.iar.codingInterviews.dynPro.gridTraveler;

import java.util.HashMap;
import java.util.Map;

public class GciDynProGridTravelerMemoizedImpl implements GciDynProGridTraveler {

	public int gridTraveler(int m, int n) {

		Map<String, Integer> memo = new HashMap<>();

		return gridTraveler(m, n, memo);
	}

	private int gridTraveler(int m, int n, Map<String, Integer> memo) {
		String memoKey = memoKey(m, n);
		if (memo.containsKey(memoKey)) {
			return memo.get(memoKey);
		}

		if (m == 0)
			return 0;

		if (n == 0)
			return 0;

		if (m == 1 && n == 1) {
			memo.put(memoKey(m, n), 1);
			return 1;
		}

		int result = gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo);
		memo.put(memoKey(m, n), result);
		return result;
	}

	private String memoKey(int m, int n) {
		return m + "," + n;
	}
}
