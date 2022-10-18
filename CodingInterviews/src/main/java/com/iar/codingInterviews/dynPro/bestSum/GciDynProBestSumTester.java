package com.iar.codingInterviews.dynPro.bestSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GciDynProBestSumTester {

	GciDynProBestSum bestSum = null;

	private GciDynProBestSum getBestSum() {
		return bestSum;
	}

	@Test
	public void test() {
		//bestSum = new GciDynProBestSumBreadthFirstSearch();
		//repeatTests();
		bestSum = new GciDynProBestSumDepthFirstSearchMemoized();
		repeatTests();
		bestSum = new GciDynProBestSumDepthFirstSearchTabulated();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test3();
		test4();
	}

	private void test1() {
		List<Integer> numbers = Arrays.asList(2, 3, 5);
		List<Integer> result = getBestSum().bestSum(8, numbers);
		Collections.sort(result);
		assert (result.size() == 2);
		assert (result.get(0) == 3);
		assert (result.get(1) == 5);
	}

	private void test2() {
		List<Integer> numbers = Arrays.asList(5, 4, 3, 7);
		List<Integer> result = getBestSum().bestSum(7, numbers);
		Collections.sort(result);
		assert (result.size() == 1);
		assert (result.get(0) == 7);
	}

	private void test3() {
		List<Integer> numbers = Arrays.asList(5, 6, 7, 8, 9, 10, 12, 15, 23, 56, 98);
		List<Integer> result = getBestSum().bestSum(24, numbers);
		Collections.sort(result);
		assert (result.size() == 2);
		assert (result.get(0) == 9);
		assert (result.get(1) == 15);
	}
	
	private void test4() {
		List<Integer> numbers = Arrays.asList(1, 2, 5, 25);
		List<Integer> result = getBestSum().bestSum(100, numbers);
		Collections.sort(result);
		assert (result.size() == 4);
		assert (result.get(0) == 25);
		assert (result.get(1) == 25);
		assert (result.get(2) == 25);
		assert (result.get(3) == 25);
	}
}