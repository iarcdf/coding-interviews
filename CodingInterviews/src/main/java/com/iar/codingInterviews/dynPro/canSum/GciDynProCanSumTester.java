package com.iar.codingInterviews.dynPro.canSum;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GciDynProCanSumTester {

	GciDynProCanSum impl = null;

	private GciDynProCanSum getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProCanSumImpl();
		repeatTests();
		impl = new GciDynProCanSumMemoizedImpl();
		repeatTests();
		impl = new GciDynProCanSumTabulatedImpl();
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
		assert (getImpl().canSum(8, Arrays.asList(2, 3, 5)));
	}

	private void test2() {
		assert (getImpl().canSum(8, Arrays.asList(5, 4, 3, 7)));
	}

	private void test3() {
		assert (getImpl().canSum(100, Arrays.asList(1, 2, 5, 25)));
	}

	private void test4() {
		assert (!getImpl().canSum(5, Arrays.asList(2, 2)));
	}

	private void test5() {
		assert (!getImpl().canSum(7, Arrays.asList(2, 4)));
	}

	private void test6() {
		assert (getImpl().canSum(10, Arrays.asList(2, 3, 5)));
	}

	private void test7() {
		assert (getImpl().canSum(7, Arrays.asList(5, 3, 4, 7)));
	}
}