package com.iar.codingInterviews.dynPro.fib;

import java.util.HashMap;
import java.util.Map;

public class GciDynProFibMemoizedImpl implements GciDynProFib {

	public int fib(int n) {

		Map<Integer, Integer> memo = new HashMap<>();

		return extracted(n, memo);
	}

	private int extracted(int n, Map<Integer, Integer> memo) {

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		if (n == 0) {
			memo.put(0, 0);
			return 0;
		}

		if (n == 1) {
			memo.put(1, 1);
			return 1;
		}

		if (n == 2) {
			memo.put(2, 1);
			return 1;
		}

		int result = fib(n - 1) + fib(n - 2);
		memo.put(n, result);

		return result;
	}
}
