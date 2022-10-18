package com.iar.codingInterviews.dynPro.gridTraveler;

import org.junit.jupiter.api.Test;

public class GciDynProGridTravelerTester {

	GciDynProGridTraveler impl = null;

	private GciDynProGridTraveler getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProGridTravelerImpl();
		repeatTests();
		impl = new GciDynProGridTravelerMemoizedImpl();
		repeatTests();
		impl = new GciDynProGridTravelerTabulatedImpl();
		repeatTests();
	}

	private void repeatTests() {
		assert (getImpl().gridTraveler(2,2) == 2);
		assert (getImpl().gridTraveler(2,3) == 3);
		assert (getImpl().gridTraveler(3,2) == 3);
		assert (getImpl().gridTraveler(3,3) == 6);
	}
}