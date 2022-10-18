package com.iar.codingInterviews.dynPro.fib;

import org.junit.jupiter.api.Test;

public class GciDynProFibTester {

	GciDynProFib impl = null;

	private GciDynProFib getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProFibImpl();
		repeatTests();
		impl = new GciDynProFibMemoizedImpl();
		repeatTests();
	}

	private void repeatTests() {
		assert (getImpl().fib(0) == 0);
		assert (getImpl().fib(1) == 1);
		assert (getImpl().fib(2) == 1);
		assert (getImpl().fib(3) == 2);
		assert (getImpl().fib(4) == 3);
		assert (getImpl().fib(5) == 5);
		assert (getImpl().fib(6) == 8);
	}
}