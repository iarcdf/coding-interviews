package com.iar.codingInterviews.dynPro.howSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GciDynProHowSumTester {

	GciDynProHowSum impl = null;

	private GciDynProHowSum getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProHowSumImpl();
		repeatTests();
		impl = new GciDynProHowSumMemoizedImpl();
		repeatTests();
		impl = new GciDynProHowSumTabulatedImpl();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
	}

	private void test1() {
		List<Integer> result = getImpl().howSum(8, Arrays.asList(2, 3, 5));
		assert (result.size() == 4);
		assert (result.get(0) == 2);
		assert (result.get(1) == 2);
		assert (result.get(2) == 2);
		assert (result.get(3) == 2);
	}

	private void test2() {
		List<Integer> result = getImpl().howSum(8, Arrays.asList(5, 4, 3, 7));
		Collections.sort(result);
		assert (result.size() == 2);
		assert (result.get(0) == 3);
		assert (result.get(1) == 5);
	}

	private void test3() {
		List<Integer> result = getImpl().howSum(100, Arrays.asList(25, 7));
		assert (result.size() == 4);
		assert (result.get(0) == 25);
		assert (result.get(1) == 25);
		assert (result.get(2) == 25);
		assert (result.get(3) == 25);
	}

	private void test4() {
		List<Integer> result = getImpl().howSum(5, Arrays.asList(2, 2));
		assert (result == null);
	}

	private void test5() {
		List<Integer> result = getImpl().howSum(7, Arrays.asList(2, 4));
		assert (result == null);
	}

	private void test6() {
		List<Integer> result = getImpl().howSum(11, Arrays.asList(5, 2));
		Collections.sort(result);
		assert (result.size() == 4);
		assert (result.get(0) == 2);
		assert (result.get(1) == 2);
		assert (result.get(2) == 2);
		assert (result.get(3) == 5);
	}

	private void test7() {
		List<Integer> result = getImpl().howSum(7, Arrays.asList(5, 3, 4, 7));
		Collections.sort(result);
		assert (result.size() == 2);
		assert (result.get(0) == 3);
		assert (result.get(1) == 4);
	}
}